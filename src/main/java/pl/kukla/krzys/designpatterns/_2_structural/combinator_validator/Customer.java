package pl.kukla.krzys.designpatterns._2_structural.combinator_validator;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@RequiredArgsConstructor
@EqualsAndHashCode
@Getter
@Builder
public class Customer {
    private final Name name;
    private final Email email;
    private final PhoneNumber phoneNumber;
    private final DateOfBirth dateOfBirth;

    @RequiredArgsConstructor(staticName = "of")
    @Getter
    static class Name {
        private final String value;
    }

    @RequiredArgsConstructor(staticName = "of")
    @Getter
    public static class Email {
        private final String value;
    }

    @RequiredArgsConstructor(staticName = "of")
    @Getter
    public static class PhoneNumber {
        private final String value;
    }

    @RequiredArgsConstructor(staticName = "of")
    @Getter
    public static class DateOfBirth {
        private final LocalDate value;
    }
}
