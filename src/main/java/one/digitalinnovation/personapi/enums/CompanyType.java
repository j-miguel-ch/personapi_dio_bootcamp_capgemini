package one.digitalinnovation.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CompanyType {

    STATE("Estatal"),
    PRIVATE("Empresa Privada"),
    OTHER("Outras empresas");

    private final String description;
}
