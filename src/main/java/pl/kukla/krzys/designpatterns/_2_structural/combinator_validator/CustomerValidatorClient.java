package pl.kukla.krzys.designpatterns._2_structural.combinator_validator;

import java.time.LocalDate;

class CustomerValidatorClient {
    public static void main(String[] args) {
        Customer customer = Customer.builder()
                .name(Customer.Name.of("Josh"))
                .email(Customer.Email.of("kkgd@fff.pl"))
                .phoneNumber(Customer.PhoneNumber.of("+101234567"))
                .dateOfBirth(Customer.DateOfBirth.of(LocalDate.of(2002, 10, 1)))
                .build();

        CustomerRegistrationValidator.CustomerValidationResult validationResult = CustomerRegistrationValidator.isEmailValid()
                .and(CustomerRegistrationValidator.isAdult())
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .apply(customer);

        System.out.println(validationResult);

    }
}
