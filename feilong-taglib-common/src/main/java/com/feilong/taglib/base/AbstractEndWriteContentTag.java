/*
 * Copyright (C) 2008 feilong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.taglib.base;

import javax.servlet.jsp.JspException;

/**
 * end 输出.
 *
 * @author feilong
 * @version 1.2.2 2015年7月23日 下午9:03:41
 * @since 1.2.2
 */
public abstract class AbstractEndWriteContentTag extends AbstractWriteContentTag{

    private static final long serialVersionUID = -3979342234682529223L;

    /*
     * (non-Javadoc)
     * 
     * @see com.feilong.taglib.base.AbstractCommonTag#doStartTag()
     */
    @Override
    public int doStartTag(){
        //Request the creation of new buffer, a BodyContent on which to evaluate the body of this tag. Returned from doStartTag when it implements BodyTag. This is an illegal return value for doStartTag when the class does not implement BodyTag.
        return EVAL_BODY_BUFFERED;
    }

    /*
     * (non-Javadoc)
     * 
     * @see javax.servlet.jsp.tagext.BodyTagSupport#doEndTag()
     */
    @Override
    public int doEndTag() throws JspException{
        execute();
        return EVAL_PAGE;
    }
}