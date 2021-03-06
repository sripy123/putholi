package org.putholi.core.dao;

import org.putholi.core.model.Donation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DonationRepository extends CrudRepository<Donation, Long>,TrackDonationCustomRepository {
    @Query("FROM Donation d where d.orderId = :orderId")
    Donation findByOrderId(String orderId);
}
