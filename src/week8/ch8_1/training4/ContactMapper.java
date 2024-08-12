package week8.ch8_1.training4;

import com.elice.entity.Contact;
import com.elice.entity.ContactPostDto;
import com.elice.entity.ContactResponseDto;
import org.mapstruct.Mapper;

// 지시사항에 맞게 코드를 수정해 주세요.
@Mapper(componentModel = "spring")
public interface ContactMapper {

    // 지시사항에 맞게 코드를 수정해 주세요.
    Contact toEntity(ContactPostDto contactPostDto);

    ContactResponseDto toDto(Contact contact);

}
