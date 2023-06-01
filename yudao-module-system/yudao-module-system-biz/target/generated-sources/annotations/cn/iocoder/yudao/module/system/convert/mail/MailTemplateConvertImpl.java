package cn.iocoder.yudao.module.system.convert.mail;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.system.controller.admin.mail.vo.template.MailTemplateCreateReqVO;
import cn.iocoder.yudao.module.system.controller.admin.mail.vo.template.MailTemplateRespVO;
import cn.iocoder.yudao.module.system.controller.admin.mail.vo.template.MailTemplateSimpleRespVO;
import cn.iocoder.yudao.module.system.controller.admin.mail.vo.template.MailTemplateUpdateReqVO;
import cn.iocoder.yudao.module.system.dal.dataobject.mail.MailTemplateDO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-31T19:44:54+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 1.8.0_311 (Oracle Corporation)"
)
public class MailTemplateConvertImpl implements MailTemplateConvert {

    @Override
    public MailTemplateDO convert(MailTemplateUpdateReqVO bean) {
        if ( bean == null ) {
            return null;
        }

        MailTemplateDO mailTemplateDO = new MailTemplateDO();

        mailTemplateDO.setId( bean.getId() );
        mailTemplateDO.setName( bean.getName() );
        mailTemplateDO.setCode( bean.getCode() );
        mailTemplateDO.setAccountId( bean.getAccountId() );
        mailTemplateDO.setNickname( bean.getNickname() );
        mailTemplateDO.setTitle( bean.getTitle() );
        mailTemplateDO.setContent( bean.getContent() );
        mailTemplateDO.setStatus( bean.getStatus() );
        mailTemplateDO.setRemark( bean.getRemark() );

        return mailTemplateDO;
    }

    @Override
    public MailTemplateDO convert(MailTemplateCreateReqVO bean) {
        if ( bean == null ) {
            return null;
        }

        MailTemplateDO mailTemplateDO = new MailTemplateDO();

        mailTemplateDO.setName( bean.getName() );
        mailTemplateDO.setCode( bean.getCode() );
        mailTemplateDO.setAccountId( bean.getAccountId() );
        mailTemplateDO.setNickname( bean.getNickname() );
        mailTemplateDO.setTitle( bean.getTitle() );
        mailTemplateDO.setContent( bean.getContent() );
        mailTemplateDO.setStatus( bean.getStatus() );
        mailTemplateDO.setRemark( bean.getRemark() );

        return mailTemplateDO;
    }

    @Override
    public MailTemplateRespVO convert(MailTemplateDO bean) {
        if ( bean == null ) {
            return null;
        }

        MailTemplateRespVO mailTemplateRespVO = new MailTemplateRespVO();

        mailTemplateRespVO.setName( bean.getName() );
        mailTemplateRespVO.setCode( bean.getCode() );
        mailTemplateRespVO.setAccountId( bean.getAccountId() );
        mailTemplateRespVO.setNickname( bean.getNickname() );
        mailTemplateRespVO.setTitle( bean.getTitle() );
        mailTemplateRespVO.setContent( bean.getContent() );
        mailTemplateRespVO.setStatus( bean.getStatus() );
        mailTemplateRespVO.setRemark( bean.getRemark() );
        mailTemplateRespVO.setId( bean.getId() );
        List<String> list = bean.getParams();
        if ( list != null ) {
            mailTemplateRespVO.setParams( new ArrayList<String>( list ) );
        }
        mailTemplateRespVO.setCreateTime( bean.getCreateTime() );

        return mailTemplateRespVO;
    }

    @Override
    public PageResult<MailTemplateRespVO> convertPage(PageResult<MailTemplateDO> pageResult) {
        if ( pageResult == null ) {
            return null;
        }

        PageResult<MailTemplateRespVO> pageResult1 = new PageResult<MailTemplateRespVO>();

        pageResult1.setList( mailTemplateDOListToMailTemplateRespVOList( pageResult.getList() ) );
        pageResult1.setTotal( pageResult.getTotal() );

        return pageResult1;
    }

    @Override
    public List<MailTemplateSimpleRespVO> convertList02(List<MailTemplateDO> list) {
        if ( list == null ) {
            return null;
        }

        List<MailTemplateSimpleRespVO> list1 = new ArrayList<MailTemplateSimpleRespVO>( list.size() );
        for ( MailTemplateDO mailTemplateDO : list ) {
            list1.add( mailTemplateDOToMailTemplateSimpleRespVO( mailTemplateDO ) );
        }

        return list1;
    }

    protected List<MailTemplateRespVO> mailTemplateDOListToMailTemplateRespVOList(List<MailTemplateDO> list) {
        if ( list == null ) {
            return null;
        }

        List<MailTemplateRespVO> list1 = new ArrayList<MailTemplateRespVO>( list.size() );
        for ( MailTemplateDO mailTemplateDO : list ) {
            list1.add( convert( mailTemplateDO ) );
        }

        return list1;
    }

    protected MailTemplateSimpleRespVO mailTemplateDOToMailTemplateSimpleRespVO(MailTemplateDO mailTemplateDO) {
        if ( mailTemplateDO == null ) {
            return null;
        }

        MailTemplateSimpleRespVO mailTemplateSimpleRespVO = new MailTemplateSimpleRespVO();

        mailTemplateSimpleRespVO.setId( mailTemplateDO.getId() );
        mailTemplateSimpleRespVO.setName( mailTemplateDO.getName() );

        return mailTemplateSimpleRespVO;
    }
}
