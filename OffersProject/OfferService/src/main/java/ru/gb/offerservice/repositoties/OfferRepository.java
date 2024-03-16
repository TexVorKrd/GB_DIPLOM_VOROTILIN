package ru.gb.offerservice.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.offerservice.models.offer_info.Offer;
import ru.gb.offerservice.models.offer_object.cargo.Cargo;

public interface OfferRepository extends JpaRepository<Offer,Long> {

}
