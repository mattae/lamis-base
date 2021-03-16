package org.lamisplus.modules.base.domain.repositories;

import org.lamisplus.modules.base.domain.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

    //@Query("select n from Notification n where n.read = false and n.user?.")
    List<Notification> findByReadIsFalse();
}