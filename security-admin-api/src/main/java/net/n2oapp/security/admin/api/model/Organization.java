/*
 * Copyright 2017-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.n2oapp.security.admin.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Организация
 */
@Data
@NoArgsConstructor
@ApiModel("Организация")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Organization {

    @JsonProperty
    @ApiModelProperty(value = "Идентификатор")
    private Integer id;

    @JsonProperty
    @ApiModelProperty(value = "Код организации")
    private String code;

    @JsonProperty
    @ApiModelProperty(value = "Краткое наименование организации")
    private String shortName;

    @JsonProperty
    @ApiModelProperty(value = "Код ОГРН (уникальный код организации)")
    private String ogrn;

    @JsonProperty
    @ApiModelProperty(value = "Код ОКПО (используется в стат.формах)")
    private String okpo;

    @JsonProperty
    @ApiModelProperty(value = "Полное наименование организации")
    private String fullName;

}
