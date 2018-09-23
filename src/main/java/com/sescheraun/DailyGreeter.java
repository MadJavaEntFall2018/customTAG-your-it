package com.sescheraun;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.LocalDate;

import static java.time.LocalDate.now;

public class DailyGreeter extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        LocalDate localDate = now();
        super.doTag();
        JspWriter out = getJspContext().getOut();
        out.println(localDate.getDayOfMonth());

    }

}
