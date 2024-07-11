package com.rocketseat.planner.link;

import com.rocketseat.planner.trip.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class LinkService {

    @Autowired
    private LinkRepository repository;

    public LinkResponse registerLink(LinkRequestPayload payload, Trip trip) {
        Link newLink = new Link(payload.url(), payload.title(), trip);

        this.repository.save(newLink);

        return new LinkResponse(newLink.getId());


    }

    public List<LinkData> getAllLinksFromTrip(UUID tripId) {
        return this.repository.findById(tripId).stream().map(link -> new LinkData(link.getId(), link.getUrl(), link.getTitle())).toList();

    }
}
