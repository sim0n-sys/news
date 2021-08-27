package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class NewsTest {
    public News newNews(){
        return  new News("July-2020", "Moringa Core Graduation", "Kevin", 1);
    }
    @Test
    public void ObjectNewsInstantiatesCorrectly() {
        News news = newNews();
        assertTrue(news instanceof News);
    }

    @Test
    public void getCorrectTitle(){
        News news = newNews();
        assertEquals("July-2020", newNews().getTitle());
    }

    @Test
    public void getCorrectContent(){
        News news = newNews();
        assertEquals("Moringa Core Graduation", newNews().getNewsContent());
    }

    @Test
    public void getCorrectAuthor(){
        News news = newNews();
        assertTrue("Kevin".equals(newNews().getWrittenBy()));
    }

    @Test
    public void getCorrectID(){
        News news = newNews();
        assertEquals(1, newNews().getDepartmentId());
    }



}