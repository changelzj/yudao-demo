package cn.iocoder.yudao.module.system.convert.notify;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.system.controller.admin.notify.vo.template.NotifyTemplateCreateReqVO;
import cn.iocoder.yudao.module.system.controller.admin.notify.vo.template.NotifyTemplateRespVO;
import cn.iocoder.yudao.module.system.controller.admin.notify.vo.template.NotifyTemplateUpdateReqVO;
import cn.iocoder.yudao.module.system.dal.dataobject.notify.NotifyTemplateDO;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-31T19:44:54+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 1.8.0_311 (Oracle Corporation)"
)
public class NotifyTemplateConvertImpl implements NotifyTemplateConvert {

    @Override
    public NotifyTemplateDO convert(NotifyTemplateCreateReqVO bean) {
        if ( bean == null ) {
            return null;
        }

        NotifyTemplateDO.NotifyTemplateDOBuilder notifyTemplateDO = NotifyTemplateDO.builder();

        notifyTemplateDO.name( bean.getName() );
        notifyTemplateDO.code( bean.getCode() );
        notifyTemplateDO.type( bean.getType() );
        notifyTemplateDO.nickname( bean.getNickname() );
        notifyTemplateDO.content( bean.getContent() );
        notifyTemplateDO.status( bean.getStatus() );
        notifyTemplateDO.remark( bean.getRemark() );

        return notifyTemplateDO.build();
    }

    @Override
    public NotifyTemplateDO convert(NotifyTemplateUpdateReqVO bean) {
        if ( bean == null ) {
            return null;
        }

        NotifyTemplateDO.NotifyTemplateDOBuilder notifyTemplateDO = NotifyTemplateDO.builder();

        notifyTemplateDO.id( bean.getId() );
        notifyTemplateDO.name( bean.getName() );
        notifyTemplateDO.code( bean.getCode() );
        notifyTemplateDO.type( bean.getType() );
        notifyTemplateDO.nickname( bean.getNickname() );
        notifyTemplateDO.content( bean.getContent() );
        notifyTemplateDO.status( bean.getStatus() );
        notifyTemplateDO.remark( bean.getRemark() );

        return notifyTemplateDO.build();
    }

    @Override
    public NotifyTemplateRespVO convert(NotifyTemplateDO bean) {
        if ( bean == null ) {
            return null;
        }

        NotifyTemplateRespVO notifyTemplateRespVO = new NotifyTemplateRespVO();

        notifyTemplateRespVO.setName( bean.getName() );
        notifyTemplateRespVO.setCode( bean.getCode() );
        notifyTemplateRespVO.setType( bean.getType() );
        notifyTemplateRespVO.setNickname( bean.getNickname() );
        notifyTemplateRespVO.setContent( bean.getContent() );
        notifyTemplateRespVO.setStatus( bean.getStatus() );
        notifyTemplateRespVO.setRemark( bean.getRemark() );
        notifyTemplateRespVO.setId( bean.getId() );
        List<String> list = bean.getParams();
        if ( list != null ) {
            notifyTemplateRespVO.setParams( new ArrayList<String>( list ) );
        }
        if ( bean.getCreateTime() != null ) {
            notifyTemplateRespVO.setCreateTime( Date.from( bean.getCreateTime().toInstant( ZoneOffset.UTC ) ) );
        }

        return notifyTemplateRespVO;
    }

    @Override
    public List<NotifyTemplateRespVO> convertList(List<NotifyTemplateDO> list) {
        if ( list == null ) {
            return null;
        }

        List<NotifyTemplateRespVO> list1 = new ArrayList<NotifyTemplateRespVO>( list.size() );
        for ( NotifyTemplateDO notifyTemplateDO : list ) {
            list1.add( convert( notifyTemplateDO ) );
        }

        return list1;
    }

    @Override
    public PageResult<NotifyTemplateRespVO> convertPage(PageResult<NotifyTemplateDO> page) {
        if ( page == null ) {
            return null;
        }

        PageResult<NotifyTemplateRespVO> pageResult = new PageResult<NotifyTemplateRespVO>();

        pageResult.setList( convertList( page.getList() ) );
        pageResult.setTotal( page.getTotal() );

        return pageResult;
    }
}
