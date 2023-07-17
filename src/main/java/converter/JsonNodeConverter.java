package converter;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Convert;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Convert
@AllArgsConstructor
public class JsonNodeConverter implements AttributeConverter<JsonNode, String> {

	private final ObjectMapper mapper;
	
	@Override
	public String convertToDatabaseColumn(JsonNode attribute) {
		if (attribute == null) {
			log.warn("attribute to convert is null ");
			return null;
		}
			return attribute.toString();
	}

	@Override
	public JsonNode convertToEntityAttribute(String dbData) {
		if(StringUtils.isBlank(dbData)) {
			log.warn("attribute to convert is null or blank ");
			return null;
		}
		
		try {
			
			var jsonNode = mapper.readTree(dbData);
			if(jsonNode.isTextual()) {
				return mapper.readTree(jsonNode.textValue());
			}
			
			return jsonNode;
		}catch (Exception e) {
			log.error("convertToEntityAttribute| error {}",e);
		}
		
		return null;
	}

}
