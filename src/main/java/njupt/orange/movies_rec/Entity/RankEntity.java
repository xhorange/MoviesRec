package njupt.orange.movies_rec.Entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "rank")
public class RankEntity {
    @EmbeddedId
    private RankKey rankKey;
    @Column(name = "rank")
    private double rank;
    private double time;
    private String picLocation;

    public RankKey getRankKey() {
        return rankKey;
    }

    public void setRankKey(RankKey rankKey) {
        this.rankKey = rankKey;
    }

    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getPicLocation() {
        return picLocation;
    }

    public void setPicLocation(String picLocation) {
        this.picLocation = picLocation;
    }
}
