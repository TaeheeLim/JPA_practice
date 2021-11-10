package hellojpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Locker {
    @Id @GeneratedValue
    private Long id;

    private String name;

    //읽기 전용
    @OneToMany(mappedBy = "locker")
    private Member member;
}
