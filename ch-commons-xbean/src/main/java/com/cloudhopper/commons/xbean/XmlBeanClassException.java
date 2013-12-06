package com.cloudhopper.commons.xbean;

/*
 * #%L
 * ch-commons-xbean
 * %%
 * Copyright (C) 2012 Cloudhopper by Twitter
 * %%
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
 * #L%
 */

/**
 * Thrown if there is an exception during reflection or instantiation of a class.
 * @author joelauer
 */
public class XmlBeanClassException extends XmlBeanException {
    private static final long serialVersionUID = 1L;

    public XmlBeanClassException(String msg) {
        this(msg, null);
    }

    public XmlBeanClassException(String msg, Throwable t) {
        super(msg, t);
    }
}
