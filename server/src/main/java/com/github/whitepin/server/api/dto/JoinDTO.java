package com.github.whitepin.server.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@XmlRootElement(name="join")
@XmlAccessorType(XmlAccessType.FIELD)
@ApiModel(description = "Join user")
public class JoinDTO {

    @NotNull
    @NotBlank
    @ApiModelProperty(notes = "user name")
    String name;

    @Email()
    @ApiModelProperty(notes = "user email")
    String email;

    @ApiModelProperty(notes = "user password")
    String password;

    @ApiModelProperty(notes = "user rePassword")
    String rePassword;

    @ApiModelProperty(notes = "user phoneNumber")
    String phoneNumber;

    @ApiModelProperty(notes = "user ci")
    String ci;

    @ApiModelProperty(notes = "user di")
    String di;
}
