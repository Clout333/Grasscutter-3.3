package emu.grasscutter.server.packet.recv;

import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.PacketHomeEnterEditModeFinishRsp;

@Opcodes(PacketOpcodes.HomeEnterEditModeFinishReq)
public class HandlerHomeEnterEditModeFinishReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        /*
         * This packet is about the edit mode
         */
        session.send(new PacketHomeEnterEditModeFinishRsp());
    }

}
