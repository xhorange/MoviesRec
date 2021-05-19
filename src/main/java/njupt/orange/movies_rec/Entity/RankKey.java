package njupt.orange.movies_rec.Entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;
import java.io.Serializable;
@Embeddable
@Table(name = "rank")
public class RankKey implements Serializable {
    @Column(name = "user_id")
    private int userId;

    public int getMoviesId() {
        return moviesId;
    }

    public void setMoviesId(int moviesId) {
        this.moviesId = moviesId;
    }

    @Column(name = "movies_id")
    private int moviesId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
