package com.qst.dms.entity;

/**
 * created By Kiri on 2022/11/10
 */
public class MatchedTransport {
    private Transport send;
    private Transport trans;
    private Transport receive;

    public Transport getSend(){
        return send;
    }

    public void setSend(Transport send) {
        this.send = send;
    }

    public Transport getTrans() {
        return trans;
    }

    public void setTrans(Transport trans) {
        this.trans = trans;
    }

    public Transport getReceive() {
        return receive;
    }

    public void setReceive(Transport receive) {
        this.receive = receive;
    }

    public MatchedTransport() {
    }

    public MatchedTransport(Transport send, Transport trans, Transport receive) {
        if(send.getTransportType()!=Transport.SEND){
            throw new RuntimeException("不是发货记录!");
        }
        if(trans.getTransportType()!=Transport.TRANSPORTING){
            throw new RuntimeException("不是送货记录!");
        }
        if(receive.getTransportType()!=Transport.RECIEVED){
            throw new RuntimeException("不是签收记录!");
        }
        this.send = send;
        this.trans = trans;
        this.receive = receive;
    }
    @Override
    public String toString(){
        return send.toString()+"|"+trans.toString()+"|"+receive.toString();
    }
}
