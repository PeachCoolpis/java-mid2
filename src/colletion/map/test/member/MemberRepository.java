package colletion.map.test.member;

import java.io.IOError;
import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    
    private Map<String,Member> map;
    
    public MemberRepository() {
        this.map = new HashMap<>();
    }
    
    public void save(Member member) {
        this.map.put(member.getId(), member);
    }
    
    public Member findById(String id) {
        if(this.map.containsKey(id)) {
            return this.map.get(id);
        }
        return null;
    }
    
    public Member findByName(String name) {
        return map.values()
                .stream()
                .filter(m -> m.getName().equals(name))
                .findFirst()
                .get();
    }
    
    public void remove(String id) {
        this.map.remove(id);
    }
}
