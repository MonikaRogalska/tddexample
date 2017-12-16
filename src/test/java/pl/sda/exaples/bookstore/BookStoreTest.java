package pl.sda.exaples.bookstore;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BookStoreTest {
    @Test
    public void buyBook(){
        //given
        String bookId = "1234";
        String cardNumber = "9999";

        //when
        OrderDTO orderDTO = new BookStore().buy(bookId,cardNumber);

        //then
        assertTrue(orderDTO.isCompleted());
    }
}
