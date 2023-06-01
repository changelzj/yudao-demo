package cn.iocoder.yudao.module.system.convert.oauth2;

import cn.iocoder.yudao.module.system.controller.admin.oauth2.vo.user.OAuth2UserInfoRespVO;
import cn.iocoder.yudao.module.system.controller.admin.oauth2.vo.user.OAuth2UserUpdateReqVO;
import cn.iocoder.yudao.module.system.controller.admin.user.vo.profile.UserProfileUpdateReqVO;
import cn.iocoder.yudao.module.system.dal.dataobject.dept.DeptDO;
import cn.iocoder.yudao.module.system.dal.dataobject.dept.PostDO;
import cn.iocoder.yudao.module.system.dal.dataobject.user.AdminUserDO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-31T19:44:55+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 1.8.0_311 (Oracle Corporation)"
)
public class OAuth2UserConvertImpl implements OAuth2UserConvert {

    @Override
    public OAuth2UserInfoRespVO convert(AdminUserDO bean) {
        if ( bean == null ) {
            return null;
        }

        OAuth2UserInfoRespVO oAuth2UserInfoRespVO = new OAuth2UserInfoRespVO();

        oAuth2UserInfoRespVO.setId( bean.getId() );
        oAuth2UserInfoRespVO.setUsername( bean.getUsername() );
        oAuth2UserInfoRespVO.setNickname( bean.getNickname() );
        oAuth2UserInfoRespVO.setEmail( bean.getEmail() );
        oAuth2UserInfoRespVO.setMobile( bean.getMobile() );
        oAuth2UserInfoRespVO.setSex( bean.getSex() );
        oAuth2UserInfoRespVO.setAvatar( bean.getAvatar() );

        return oAuth2UserInfoRespVO;
    }

    @Override
    public OAuth2UserInfoRespVO.Dept convert(DeptDO dept) {
        if ( dept == null ) {
            return null;
        }

        OAuth2UserInfoRespVO.Dept dept1 = new OAuth2UserInfoRespVO.Dept();

        dept1.setId( dept.getId() );
        dept1.setName( dept.getName() );

        return dept1;
    }

    @Override
    public List<OAuth2UserInfoRespVO.Post> convertList(List<PostDO> list) {
        if ( list == null ) {
            return null;
        }

        List<OAuth2UserInfoRespVO.Post> list1 = new ArrayList<OAuth2UserInfoRespVO.Post>( list.size() );
        for ( PostDO postDO : list ) {
            list1.add( postDOToPost( postDO ) );
        }

        return list1;
    }

    @Override
    public UserProfileUpdateReqVO convert(OAuth2UserUpdateReqVO bean) {
        if ( bean == null ) {
            return null;
        }

        UserProfileUpdateReqVO userProfileUpdateReqVO = new UserProfileUpdateReqVO();

        userProfileUpdateReqVO.setNickname( bean.getNickname() );
        userProfileUpdateReqVO.setEmail( bean.getEmail() );
        userProfileUpdateReqVO.setMobile( bean.getMobile() );
        userProfileUpdateReqVO.setSex( bean.getSex() );

        return userProfileUpdateReqVO;
    }

    protected OAuth2UserInfoRespVO.Post postDOToPost(PostDO postDO) {
        if ( postDO == null ) {
            return null;
        }

        OAuth2UserInfoRespVO.Post post = new OAuth2UserInfoRespVO.Post();

        post.setId( postDO.getId() );
        post.setName( postDO.getName() );

        return post;
    }
}
