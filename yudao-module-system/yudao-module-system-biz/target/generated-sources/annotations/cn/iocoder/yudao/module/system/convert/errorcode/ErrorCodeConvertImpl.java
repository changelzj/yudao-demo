package cn.iocoder.yudao.module.system.convert.errorcode;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.system.api.errorcode.dto.ErrorCodeAutoGenerateReqDTO;
import cn.iocoder.yudao.module.system.api.errorcode.dto.ErrorCodeRespDTO;
import cn.iocoder.yudao.module.system.controller.admin.errorcode.vo.ErrorCodeCreateReqVO;
import cn.iocoder.yudao.module.system.controller.admin.errorcode.vo.ErrorCodeExcelVO;
import cn.iocoder.yudao.module.system.controller.admin.errorcode.vo.ErrorCodeRespVO;
import cn.iocoder.yudao.module.system.controller.admin.errorcode.vo.ErrorCodeUpdateReqVO;
import cn.iocoder.yudao.module.system.dal.dataobject.errorcode.ErrorCodeDO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-31T19:44:55+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 1.8.0_311 (Oracle Corporation)"
)
public class ErrorCodeConvertImpl implements ErrorCodeConvert {

    @Override
    public ErrorCodeDO convert(ErrorCodeCreateReqVO bean) {
        if ( bean == null ) {
            return null;
        }

        ErrorCodeDO errorCodeDO = new ErrorCodeDO();

        errorCodeDO.setApplicationName( bean.getApplicationName() );
        errorCodeDO.setCode( bean.getCode() );
        errorCodeDO.setMessage( bean.getMessage() );
        errorCodeDO.setMemo( bean.getMemo() );

        return errorCodeDO;
    }

    @Override
    public ErrorCodeDO convert(ErrorCodeUpdateReqVO bean) {
        if ( bean == null ) {
            return null;
        }

        ErrorCodeDO errorCodeDO = new ErrorCodeDO();

        errorCodeDO.setId( bean.getId() );
        errorCodeDO.setApplicationName( bean.getApplicationName() );
        errorCodeDO.setCode( bean.getCode() );
        errorCodeDO.setMessage( bean.getMessage() );
        errorCodeDO.setMemo( bean.getMemo() );

        return errorCodeDO;
    }

    @Override
    public ErrorCodeRespVO convert(ErrorCodeDO bean) {
        if ( bean == null ) {
            return null;
        }

        ErrorCodeRespVO errorCodeRespVO = new ErrorCodeRespVO();

        errorCodeRespVO.setApplicationName( bean.getApplicationName() );
        errorCodeRespVO.setCode( bean.getCode() );
        errorCodeRespVO.setMessage( bean.getMessage() );
        errorCodeRespVO.setMemo( bean.getMemo() );
        errorCodeRespVO.setId( bean.getId() );
        errorCodeRespVO.setType( bean.getType() );
        errorCodeRespVO.setCreateTime( bean.getCreateTime() );

        return errorCodeRespVO;
    }

    @Override
    public List<ErrorCodeRespVO> convertList(List<ErrorCodeDO> list) {
        if ( list == null ) {
            return null;
        }

        List<ErrorCodeRespVO> list1 = new ArrayList<ErrorCodeRespVO>( list.size() );
        for ( ErrorCodeDO errorCodeDO : list ) {
            list1.add( convert( errorCodeDO ) );
        }

        return list1;
    }

    @Override
    public PageResult<ErrorCodeRespVO> convertPage(PageResult<ErrorCodeDO> page) {
        if ( page == null ) {
            return null;
        }

        PageResult<ErrorCodeRespVO> pageResult = new PageResult<ErrorCodeRespVO>();

        pageResult.setList( convertList( page.getList() ) );
        pageResult.setTotal( page.getTotal() );

        return pageResult;
    }

    @Override
    public List<ErrorCodeExcelVO> convertList02(List<ErrorCodeDO> list) {
        if ( list == null ) {
            return null;
        }

        List<ErrorCodeExcelVO> list1 = new ArrayList<ErrorCodeExcelVO>( list.size() );
        for ( ErrorCodeDO errorCodeDO : list ) {
            list1.add( errorCodeDOToErrorCodeExcelVO( errorCodeDO ) );
        }

        return list1;
    }

    @Override
    public ErrorCodeDO convert(ErrorCodeAutoGenerateReqDTO bean) {
        if ( bean == null ) {
            return null;
        }

        ErrorCodeDO errorCodeDO = new ErrorCodeDO();

        errorCodeDO.setApplicationName( bean.getApplicationName() );
        errorCodeDO.setCode( bean.getCode() );
        errorCodeDO.setMessage( bean.getMessage() );

        return errorCodeDO;
    }

    @Override
    public List<ErrorCodeRespDTO> convertList03(List<ErrorCodeDO> list) {
        if ( list == null ) {
            return null;
        }

        List<ErrorCodeRespDTO> list1 = new ArrayList<ErrorCodeRespDTO>( list.size() );
        for ( ErrorCodeDO errorCodeDO : list ) {
            list1.add( errorCodeDOToErrorCodeRespDTO( errorCodeDO ) );
        }

        return list1;
    }

    protected ErrorCodeExcelVO errorCodeDOToErrorCodeExcelVO(ErrorCodeDO errorCodeDO) {
        if ( errorCodeDO == null ) {
            return null;
        }

        ErrorCodeExcelVO errorCodeExcelVO = new ErrorCodeExcelVO();

        errorCodeExcelVO.setId( errorCodeDO.getId() );
        errorCodeExcelVO.setType( errorCodeDO.getType() );
        errorCodeExcelVO.setApplicationName( errorCodeDO.getApplicationName() );
        errorCodeExcelVO.setCode( errorCodeDO.getCode() );
        errorCodeExcelVO.setMessage( errorCodeDO.getMessage() );
        errorCodeExcelVO.setMemo( errorCodeDO.getMemo() );
        errorCodeExcelVO.setCreateTime( errorCodeDO.getCreateTime() );

        return errorCodeExcelVO;
    }

    protected ErrorCodeRespDTO errorCodeDOToErrorCodeRespDTO(ErrorCodeDO errorCodeDO) {
        if ( errorCodeDO == null ) {
            return null;
        }

        ErrorCodeRespDTO errorCodeRespDTO = new ErrorCodeRespDTO();

        errorCodeRespDTO.setCode( errorCodeDO.getCode() );
        errorCodeRespDTO.setMessage( errorCodeDO.getMessage() );
        errorCodeRespDTO.setUpdateTime( errorCodeDO.getUpdateTime() );

        return errorCodeRespDTO;
    }
}
