package com.sescheraun;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DailyGreeter extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();

        int hour = localTime.getHour();
        String greet = "";
        if (hour > 11) {
            greet = "Good Afternoon";
        } else {
            greet = "Good Morning";
        }

        JspWriter out = getJspContext().getOut();
        out.println(greet);

    }

}
