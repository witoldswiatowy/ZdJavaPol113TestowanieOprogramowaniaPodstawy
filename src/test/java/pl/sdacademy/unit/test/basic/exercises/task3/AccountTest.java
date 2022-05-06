package pl.sdacademy.unit.test.basic.exercises.task3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void shouldTransferMoney() {
        //given
        Account credit = new Account(
                1000,
                "12345678901234567890123456",
                new Customer("Jan", "Nowak"));
        Account debit = new Account(
                2000,
                "12345678901234567890123456",
                new Customer("Ala", "Kowalska"));
        //when
        debit.transferMoney(credit, 100);
        //then
        assertEquals(1100, credit.getBalance());
        assertEquals(1900, debit.getBalance());
        assertThat(credit.getBalance()).isEqualTo(1100);
        assertThat(debit.getBalance()).isEqualTo(1900);
    }

    @Test
    void shouldNotTransferMoneyIfCreditNumberIsWrong(){
        //given
        Account credit = new Account(
                1000,
                "1",
                new Customer("Jan", "Nowak"));
        Account debit = new Account(
                2000,
                "12345678901234567890123456",
                new Customer("Ala", "Kowalska"));
        //when
        debit.transferMoney(credit, 100);
        //then
        assertEquals(1000, credit.getBalance());
        assertEquals(2000, debit.getBalance());
        assertThat(credit.getBalance()).isEqualTo(1000);
        assertThat(debit.getBalance()).isEqualTo(2000);
    }

    @Test
    void shouldNotTransferMoneyIfCreditNumberIsWrong_2(){
        //given
        Account credit = new Account(
                1000,
                "123456789012345678901234561",
                new Customer("Jan", "Nowak"));
        Account debit = new Account(
                2000,
                "12345678901234567890123456",
                new Customer("Ala", "Kowalska"));
        //when
        debit.transferMoney(credit, 100);
        //then
        assertEquals(1000, credit.getBalance());
        assertEquals(2000, debit.getBalance());
        assertThat(credit.getBalance()).isEqualTo(1000);
        assertThat(debit.getBalance()).isEqualTo(2000);
    }
    @Test
    void shouldNotTransferMoneyIfCreditNumberIsWrong_3(){
        //given
        Account credit = new Account(
                1000,
                "abcdefghijklmn",
                new Customer("Jan", "Nowak"));
        Account debit = new Account(
                2000,
                "12345678901234567890123456",
                new Customer("Ala", "Kowalska"));
        //when
        debit.transferMoney(credit, 100);
        //then
        assertEquals(1000, credit.getBalance());
        assertEquals(2000, debit.getBalance());
        assertThat(credit.getBalance()).isEqualTo(1000);
        assertThat(debit.getBalance()).isEqualTo(2000);
    }

    /*
    walidacja amounta:
    amount = -1000
    amount = 0
    amount większy niż aktualny debit account -> debit.balance = 2000, amount =3000


     account number:
     z pustym stringiem
     spacja
    */

}