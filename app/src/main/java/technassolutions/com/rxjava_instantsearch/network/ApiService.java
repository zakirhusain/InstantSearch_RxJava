package technassolutions.com.rxjava_instantsearch.network;


import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;
import technassolutions.com.rxjava_instantsearch.network.model.Contact;

public interface ApiService {

    @GET("contacts.php")
    Single<List<Contact>> getContacts(@Query("source") String source, @Query("search") String search);

}
