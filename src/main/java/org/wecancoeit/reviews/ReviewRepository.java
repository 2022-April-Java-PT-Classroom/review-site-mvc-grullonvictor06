package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository(){
        Review eastBlueSaga = new Review(1L,"East Blue Saga","1st Saga in One Piece.");
        Review alabastaSaga = new Review(2L,"Alabasta Saga","2nd Saga in One Piece.");
        Review skyIslandSaga = new Review(3L, "Sky Island Saga","3rd Saga in One Piece.");
        Review water7Saga = new Review(4L,"Water 7 Saga", "4th Saga in One Piece.");
        Review thrillerBarkSaga = new Review(5L, "Thriller Bark Saga", "5th Saga in One Piece.");
        Review summitWarSaga = new Review(6L, "Summit War Saga", "6th and the last saga of the 1st half or pre-timeskip in One Piece.");
        Review fishManIslandSaga= new Review(7L, "Fish-Man Island Saga", "7th and the beginning of the 2nd half or post-timeskip in One Piece.");
        Review dressrosaSaga = new Review(8L, "Dressrosa Saga", "8th Saga in One Piece.");
        Review fourEmperorsSaga = new Review(9L, "Four Emperors Saga", "8th and current Saga.");

        reviewsList.put(eastBlueSaga.getId(), eastBlueSaga);
        reviewsList.put(alabastaSaga.getId(), alabastaSaga);
        reviewsList.put(skyIslandSaga.getId(), skyIslandSaga);
        reviewsList.put(water7Saga.getId(), water7Saga);
        reviewsList.put(thrillerBarkSaga.getId(), thrillerBarkSaga);
        reviewsList.put(summitWarSaga.getId(), summitWarSaga);
        reviewsList.put(fishManIslandSaga.getId(), fishManIslandSaga);
        reviewsList.put(dressrosaSaga.getId(), dressrosaSaga);
        reviewsList.put(fourEmperorsSaga.getId(), fourEmperorsSaga);

    }

    public ReviewRepository(Review ...reviewsToAdd){
        for(Review review: reviewsToAdd){
            reviewsList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }
}
