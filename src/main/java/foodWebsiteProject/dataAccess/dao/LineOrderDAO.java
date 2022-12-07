package foodWebsiteProject.dataAccess.dao;


import foodWebsiteProject.dataAccess.entity.LineOrderEntity;
import foodWebsiteProject.dataAccess.repository.LineOrderRepository;
import foodWebsiteProject.dataAccess.util.ProviderConverter;
import foodWebsiteProject.model.LineOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class LineOrderDAO implements LineOrderDataAccess {


    private ProviderConverter lineOrderConverter;

    private LineOrderRepository lineOrderRepository;

    @Autowired
    public LineOrderDAO(ProviderConverter lineOrderConverter, LineOrderRepository lineOrderRepository){
        this.lineOrderConverter = lineOrderConverter;
        this.lineOrderRepository = lineOrderRepository;
    }
    public LineOrder save(LineOrder lineOrder){
        LineOrderEntity lineOrderEntity = lineOrderConverter.lineOrderModelToLineOrderEntity(lineOrder);
        lineOrderEntity = lineOrderRepository.save(lineOrderEntity);
        return lineOrderConverter.lineOrderEntityToLineOrderModel(lineOrderEntity);
    }
}
