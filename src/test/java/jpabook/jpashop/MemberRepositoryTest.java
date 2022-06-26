package jpabook.jpashop;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void testMember() throws Exception {
        //given
        Member member = new Member();
        member.setUsername("memberA");

        // when
        Long id = memberRepository.save(member);
        Member member1 = memberRepository.find(id);

        //then
        Assertions.assertThat(member1.getId()).isEqualTo(member.getId());
        Assertions.assertThat(member1.getUsername()).isEqualTo(member.getUsername());


    }
}