package com.managepeople.database;

import com.managepeople.models.People;
import com.managepeople.repository.IPeopleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class PeopleData extends BaseData<People, IPeopleRepository> {
    private List<People> initListPeoples() {
        List<People> peoples = new ArrayList<>();
        People people1 = new People();
        people1.setId(1L);
        people1.setFirstName("Nam");
        people1.setLastName("Bui");
        people1.setBirthDay(2000L);
        people1.setStatus(1);
        People people2 = new People();
        people2.setId(2L);
        people2.setFirstName("Chen");
        people2.setLastName("Danyul");
        people2.setBirthDay(2000L);
        people2.setStatus(0);
        People people3 = new People();
        people3.setId(3L);
        people3.setFirstName("Cuy");
        people3.setLastName("Xuyen");
        people3.setBirthDay(2001L);
        people3.setStatus(1);
        People people4 = new People();
        people4.setId(4L);
        people4.setFirstName("Cam");
        people4.setLastName("Chu be dan");
        people4.setBirthDay(2001L);
        people4.setStatus(1);
        People people5 = new People();
        people5.setId(5L);
        people5.setFirstName("Vip");
        people5.setLastName("pro No1");
        people5.setBirthDay(2002L);
        people5.setStatus(0);
        peoples.add(people1);
        peoples.add(people2);
        peoples.add(people3);
        peoples.add(people4);
        peoples.add(people5);

        return peoples;
    }

    @Override
    public void logInsertData(List<People> peoples, IPeopleRepository peopleRepository) {
        peoples.stream().forEach(
                people -> {
                    logger.debug(marker, "Insert data: ", peopleRepository.save(people));
                }
        );
    }

    @Bean
    CommandLineRunner initDataPeoples(IPeopleRepository peopleRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                long countPeople = peopleRepository.count();
                if (countPeople == 0) {
                    List<People> peoples = initListPeoples();
                    logInsertData(peoples, peopleRepository);
                }
            }
        };
    }
}
