package com.lib.lombok;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class QrCodeReq {

    private String intentUrl;
    private String additionalInfo;
}
