package comsysto.talks.demojava;

import static com.fasterxml.jackson.annotation.JsonTypeInfo.Id.DEDUCTION;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


@JsonTypeInfo(use = DEDUCTION)
@JsonSubTypes({
    @Type(WithInteger.class),
    @Type(WithString.class),
    @Type(WithComplexType.class),
    @Type(WithGenericType.class)
})
sealed interface TestRequest permits WithInteger, WithString, WithComplexType, WithGenericType { }

record ComplexType(Integer x, Integer y) { }

record WithInteger(Integer intValue) implements TestRequest { }
record WithString(String stringValue) implements TestRequest { }
record WithComplexType(ComplexType complexValue) implements TestRequest { }
record WithGenericType<T>(T genericValue) implements TestRequest { }
