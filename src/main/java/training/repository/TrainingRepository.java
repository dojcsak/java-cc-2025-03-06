package training.repository;

import training.entity.Training;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public class TrainingRepository {

    private final AtomicLong idGenerator = new AtomicLong();

    private final Map<Long, Training> trainings = new HashMap<>();

    public void save(Training training) {
        long id = idGenerator.incrementAndGet();
        training.setId(id);
        trainings.put(id, training);
    }

    public Training findById(long id) {
        return trainings.get(id);
    }
}
