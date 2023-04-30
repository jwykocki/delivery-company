import javax.persistence.*;

//should use this ??
import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Date;
import java.time.*;



@Entity
public class TemporalValues {

    @Basic
    private Date sqlDate;

    @Basic
    private Time sqlTime;

    @Basic
    private Timestamp sqlTimestamp;
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Basic
    @Temporal(TemporalType.DATE)
    private java.util.Date utilDate;

    @Basic
    @Temporal(TemporalType.TIME)
    private java.util.Date utilTime;

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date utilTimestamp;

    @Basic
    @Temporal(TemporalType.DATE)
    private java.util.Calendar calendarDate;

    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Calendar calendarTimestamp;

    @Basic
    private java.time.LocalDate localDate;

    @Basic
    private java.time.LocalTime localTime;

    @Basic
    private java.time.OffsetTime offsetTime;

    @Basic
    private java.time.Instant instant;

    @Basic
    private java.time.LocalDateTime localDateTime;

    @Basic
    private java.time.OffsetDateTime offsetDateTime;

    @Basic
    private java.time.ZonedDateTime zonedDateTime;
}