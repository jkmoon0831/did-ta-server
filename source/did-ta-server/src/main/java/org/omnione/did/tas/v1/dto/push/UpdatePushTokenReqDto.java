/*
 * Copyright 2024 OmniOne.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.omnione.did.tas.v1.dto.push;

import org.omnione.did.base.datamodel.data.Proof;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * DTO for updating push token.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UpdatePushTokenReqDto {
    @NotNull(message = "id cannot be null")
    private String id;
    @NotNull(message = "did cannot be null")
    private String did;
    @NotNull(message = "appId cannot be null")
    private String appId;
    @NotNull(message = "pushToken cannot be null")
    private String pushToken;
    //@TODO: Push 관련 테스트 완료 후 @Valid 추가
    private Proof proof;
}
