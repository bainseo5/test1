package andrew.murphy.interview;

import org.springframework.data.repository.CrudRepository;

import andrew.murphy.interview.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

}
