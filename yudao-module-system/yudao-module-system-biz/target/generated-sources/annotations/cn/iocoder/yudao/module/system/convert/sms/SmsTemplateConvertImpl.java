package cn.iocoder.yudao.module.system.convert.sms;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.system.controller.admin.sms.vo.template.SmsTemplateCreateReqVO;
import cn.iocoder.yudao.module.system.controller.admin.sms.vo.template.SmsTemplateExcelVO;
import cn.iocoder.yudao.module.system.controller.admin.sms.vo.template.SmsTemplateRespVO;
import cn.iocoder.yudao.module.system.controller.admin.sms.vo.template.SmsTemplateUpdateReqVO;
import cn.iocoder.yudao.module.system.dal.dataobject.sms.SmsTemplateDO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-31T19:44:55+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 1.8.0_311 (Oracle Corporation)"
)
public class SmsTemplateConvertImpl implements SmsTemplateConvert {

    @Override
    public SmsTemplateDO convert(SmsTemplateCreateReqVO bean) {
        if ( bean == null ) {
            return null;
        }

        SmsTemplateDO smsTemplateDO = new SmsTemplateDO();

        smsTemplateDO.setType( bean.getType() );
        smsTemplateDO.setStatus( bean.getStatus() );
        smsTemplateDO.setCode( bean.getCode() );
        smsTemplateDO.setName( bean.getName() );
        smsTemplateDO.setContent( bean.getContent() );
        smsTemplateDO.setRemark( bean.getRemark() );
        smsTemplateDO.setApiTemplateId( bean.getApiTemplateId() );
        smsTemplateDO.setChannelId( bean.getChannelId() );

        return smsTemplateDO;
    }

    @Override
    public SmsTemplateDO convert(SmsTemplateUpdateReqVO bean) {
        if ( bean == null ) {
            return null;
        }

        SmsTemplateDO smsTemplateDO = new SmsTemplateDO();

        smsTemplateDO.setId( bean.getId() );
        smsTemplateDO.setType( bean.getType() );
        smsTemplateDO.setStatus( bean.getStatus() );
        smsTemplateDO.setCode( bean.getCode() );
        smsTemplateDO.setName( bean.getName() );
        smsTemplateDO.setContent( bean.getContent() );
        smsTemplateDO.setRemark( bean.getRemark() );
        smsTemplateDO.setApiTemplateId( bean.getApiTemplateId() );
        smsTemplateDO.setChannelId( bean.getChannelId() );

        return smsTemplateDO;
    }

    @Override
    public SmsTemplateRespVO convert(SmsTemplateDO bean) {
        if ( bean == null ) {
            return null;
        }

        SmsTemplateRespVO smsTemplateRespVO = new SmsTemplateRespVO();

        smsTemplateRespVO.setType( bean.getType() );
        smsTemplateRespVO.setStatus( bean.getStatus() );
        smsTemplateRespVO.setCode( bean.getCode() );
        smsTemplateRespVO.setName( bean.getName() );
        smsTemplateRespVO.setContent( bean.getContent() );
        smsTemplateRespVO.setRemark( bean.getRemark() );
        smsTemplateRespVO.setApiTemplateId( bean.getApiTemplateId() );
        smsTemplateRespVO.setChannelId( bean.getChannelId() );
        smsTemplateRespVO.setId( bean.getId() );
        smsTemplateRespVO.setChannelCode( bean.getChannelCode() );
        List<String> list = bean.getParams();
        if ( list != null ) {
            smsTemplateRespVO.setParams( new ArrayList<String>( list ) );
        }
        smsTemplateRespVO.setCreateTime( bean.getCreateTime() );

        return smsTemplateRespVO;
    }

    @Override
    public List<SmsTemplateRespVO> convertList(List<SmsTemplateDO> list) {
        if ( list == null ) {
            return null;
        }

        List<SmsTemplateRespVO> list1 = new ArrayList<SmsTemplateRespVO>( list.size() );
        for ( SmsTemplateDO smsTemplateDO : list ) {
            list1.add( convert( smsTemplateDO ) );
        }

        return list1;
    }

    @Override
    public PageResult<SmsTemplateRespVO> convertPage(PageResult<SmsTemplateDO> page) {
        if ( page == null ) {
            return null;
        }

        PageResult<SmsTemplateRespVO> pageResult = new PageResult<SmsTemplateRespVO>();

        pageResult.setList( convertList( page.getList() ) );
        pageResult.setTotal( page.getTotal() );

        return pageResult;
    }

    @Override
    public List<SmsTemplateExcelVO> convertList02(List<SmsTemplateDO> list) {
        if ( list == null ) {
            return null;
        }

        List<SmsTemplateExcelVO> list1 = new ArrayList<SmsTemplateExcelVO>( list.size() );
        for ( SmsTemplateDO smsTemplateDO : list ) {
            list1.add( smsTemplateDOToSmsTemplateExcelVO( smsTemplateDO ) );
        }

        return list1;
    }

    protected SmsTemplateExcelVO smsTemplateDOToSmsTemplateExcelVO(SmsTemplateDO smsTemplateDO) {
        if ( smsTemplateDO == null ) {
            return null;
        }

        SmsTemplateExcelVO smsTemplateExcelVO = new SmsTemplateExcelVO();

        smsTemplateExcelVO.setId( smsTemplateDO.getId() );
        smsTemplateExcelVO.setType( smsTemplateDO.getType() );
        smsTemplateExcelVO.setStatus( smsTemplateDO.getStatus() );
        smsTemplateExcelVO.setCode( smsTemplateDO.getCode() );
        smsTemplateExcelVO.setName( smsTemplateDO.getName() );
        smsTemplateExcelVO.setContent( smsTemplateDO.getContent() );
        smsTemplateExcelVO.setRemark( smsTemplateDO.getRemark() );
        smsTemplateExcelVO.setApiTemplateId( smsTemplateDO.getApiTemplateId() );
        smsTemplateExcelVO.setChannelId( smsTemplateDO.getChannelId() );
        smsTemplateExcelVO.setChannelCode( smsTemplateDO.getChannelCode() );
        smsTemplateExcelVO.setCreateTime( smsTemplateDO.getCreateTime() );

        return smsTemplateExcelVO;
    }
}
