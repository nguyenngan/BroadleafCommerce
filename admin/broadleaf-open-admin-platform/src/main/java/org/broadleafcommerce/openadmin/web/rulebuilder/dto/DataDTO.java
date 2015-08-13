/*
 * #%L
 * BroadleafCommerce Open Admin Platform
 * %%
 * Copyright (C) 2009 - 2013 Broadleaf Commerce
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.broadleafcommerce.openadmin.web.rulebuilder.dto;

import org.apache.commons.lang3.builder.EqualsBuilder;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Elbert Bautista (elbertbautista)
 */
public class DataDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    protected Long pk;

    protected Integer quantity;

    protected String condition;

    protected ArrayList<DataDTO> rules = new ArrayList<DataDTO>();

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public ArrayList<DataDTO> getRules() {
        return rules;
    }

    public void setRules(ArrayList<DataDTO> rules) {
        this.rules = rules;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null && getClass().isAssignableFrom(obj.getClass())) {
            DataDTO that = (DataDTO) obj;
            return new EqualsBuilder()
                .append(pk, that.pk)
                .append(quantity, that.quantity)
                .append(condition, that.condition)
                .append(rules.toArray(), that.rules.toArray())
                .build();
        }
        return false;
    }
}
