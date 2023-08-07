package pl.kukla.krzys.designpatterns._2_structural.combinator_validator;


import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

interface CustomerRegistrationValidator extends Function<Customer, CustomerRegistrationValidator.CustomerValidationResult> {

    static CustomerRegistrationValidator isEmailValid() {
        return customer -> customer.getEmail().getValue().contains("@") ?
                CustomerValidationResult.SUCCESS : CustomerValidationResult.CUSTOMER_EMAIL_FAILED;
    }

    static CustomerRegistrationValidator isAdult() {
        return customer -> Period.between(customer.getDateOfBirth().getValue(), LocalDate.now()).getYears() > 16 ?
                CustomerValidationResult.SUCCESS : CustomerValidationResult.CUSTOMER_IS_ADULT_FAILED;
    }

    static CustomerRegistrationValidator isPhoneNumberValid() {
        return customer -> customer.getPhoneNumber().getValue().startsWith("+0") ?
                CustomerValidationResult.SUCCESS : CustomerValidationResult.CUSTOMER_PHONE_NUMBER_FAILED;
    }

    default CustomerRegistrationValidator and(CustomerRegistrationValidator customerRegistrationValidator) {
        return customer -> {
            CustomerValidationResult validationResult = this.apply(customer);
            return validationResult == CustomerValidationResult.SUCCESS ?
                    customerRegistrationValidator.apply(customer) : validationResult;
        };
    }

    enum CustomerValidationResult {
        SUCCESS,
        CUSTOMER_IS_ADULT_FAILED,
        CUSTOMER_PHONE_NUMBER_FAILED,
        CUSTOMER_EMAIL_FAILED
    }
}
