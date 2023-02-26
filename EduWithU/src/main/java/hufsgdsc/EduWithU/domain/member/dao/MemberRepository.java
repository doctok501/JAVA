package hufsgdsc.EduWithU.domain.member.dao;

import hufsgdsc.EduWithU.domain.member.domain.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    @PersistenceContext
    private final EntityManager em;
    /*
    public Member saveMember(String name,String password, String email, String imageUrl, String message, String token) {
        Member member = Member.of(name,password, email, imageUrl, message, token);
        em.persist(member);
        return member;
    }
    */
    
    public Member updateMemberImageURL (String inputtoken, String imageURL) {


        return null;
    }



}
