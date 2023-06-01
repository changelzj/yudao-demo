package cn.iocoder.yudao.module.system.convert.mail;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.system.controller.admin.mail.vo.log.MailLogRespVO;
import cn.iocoder.yudao.module.system.dal.dataobject.mail.MailLogDO;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-31T19:44:55+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 1.8.0_311 (Oracle Corporation)"
)
public class MailLogConvertImpl implements MailLogConvert {

    @Override
    public PageResult<MailLogRespVO> convertPage(PageResult<MailLogDO> pageResult) {
        if ( pageResult == null ) {
            return null;
        }

        PageResult<MailLogRespVO> pageResult1 = new PageResult<MailLogRespVO>();

        pageResult1.setList( mailLogDOListToMailLogRespVOList( pageResult.getList() ) );
        pageResult1.setTotal( pageResult.getTotal() );

        return pageResult1;
    }

    @Override
    public MailLogRespVO convert(MailLogDO bean) {
        if ( bean == null ) {
            return null;
        }

        MailLogRespVO mailLogRespVO = new MailLogRespVO();

        mailLogRespVO.setUserId( bean.getUserId() );
        if ( bean.getUserType() != null ) {
            mailLogRespVO.setUserType( bean.getUserType().byteValue() );
        }
        mailLogRespVO.setToMail( bean.getToMail() );
        mailLogRespVO.setAccountId( bean.getAccountId() );
        mailLogRespVO.setFromMail( bean.getFromMail() );
        mailLogRespVO.setTemplateId( bean.getTemplateId() );
        mailLogRespVO.setTemplateCode( bean.getTemplateCode() );
        mailLogRespVO.setTemplateNickname( bean.getTemplateNickname() );
        mailLogRespVO.setTemplateTitle( bean.getTemplateTitle() );
        mailLogRespVO.setTemplateContent( bean.getTemplateContent() );
        Map<String, Object> map = bean.getTemplateParams();
        if ( map != null ) {
            mailLogRespVO.setTemplateParams( new LinkedHashMap<String, Object>( map ) );
        }
        if ( bean.getSendStatus() != null ) {
            mailLogRespVO.setSendStatus( bean.getSendStatus().byteValue() );
        }
        mailLogRespVO.setSendTime( bean.getSendTime() );
        mailLogRespVO.setSendMessageId( bean.getSendMessageId() );
        mailLogRespVO.setSendException( bean.getSendException() );
        mailLogRespVO.setId( bean.getId() );
        mailLogRespVO.setCreateTime( bean.getCreateTime() );

        return mailLogRespVO;
    }

    protected List<MailLogRespVO> mailLogDOListToMailLogRespVOList(List<MailLogDO> list) {
        if ( list == null ) {
            return null;
        }

        List<MailLogRespVO> list1 = new ArrayList<MailLogRespVO>( list.size() );
        for ( MailLogDO mailLogDO : list ) {
            list1.add( convert( mailLogDO ) );
        }

        return list1;
    }
}
