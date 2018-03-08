package lv.tsi.javacourses.bookshelf;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named

public class BookSearchForm {
    private String term;

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }
}
