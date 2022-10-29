package pro.sky.telegrambot.schedullers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import pro.sky.telegrambot.repository.RemindRepository;
import pro.sky.telegrambot.repository.entity.RemindEntity;

import java.time.Instant;
import java.util.UUID;

@Component
public class ReminderScheduller {
    @Autowired
    private RemindRepository repository;


   @Scheduled (fixedRate = 5000)
    public void sendremind(){
       Iterable<RemindEntity> all = repository.findAll();
       all.forEach(x -> System.out.println(x.getText()) );
    }

    @Scheduled (fixedRate = 10000)
    public void addremind(){
       RemindEntity entity = new RemindEntity();
       entity.setText("Новая запись");
       entity.setTime(Instant.now());
       entity.setId(156L);
       repository.save(entity);
    }
}
