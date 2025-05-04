package br.com.unicuritiba.todoapi.repository;

import br.com.unicuritiba.todoapi.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
