package week6.ch6_2.training3;

@Service
public class UserInjectionService {

    private final UserRepository userRepository;
    private AnotherUserRepository anotherUserRepository;

    // TODO: 생성자 주입
    @Autowired
    public UserInjectionService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // TODO: 필드 주입
    @Autowired
    private YetAnotherUserRepository yetAnotherUserRepository;


    // TODO: 세터 주입
    @Autowired
    public void setAnotherUserRepository(AnotherUserRepository anotherUserRepository) {
        this.anotherUserRepository = anotherUserRepository;
    }
}