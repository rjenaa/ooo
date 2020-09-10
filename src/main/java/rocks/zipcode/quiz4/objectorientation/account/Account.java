package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Account extends BankAccount {
    private Long Id = 0L;
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }
}

