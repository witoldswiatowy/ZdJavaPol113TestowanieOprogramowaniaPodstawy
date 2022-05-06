package pl.sdacademy.unit.test.basic.exercises.unit.task3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    @Test
    void should_return_format_Date_to_Year_Day_motnh (){
        //given
        DateFormatter dateFormatter = new DateFormatter();
        LocalDate inpute = LocalDate.of(2000,1,20);
        String expetedResult = "2000-20-01";
        //when
        String result = dateFormatter.formatDate(inpute);
        //then
        assertEquals(expetedResult,result); //jUnit
        assertThat(result).isEqualTo(expetedResult); //asserJ
    }

}