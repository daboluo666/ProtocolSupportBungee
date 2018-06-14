package protocolsupport.protocol.packet.middleimpl.readable.play.v_4_5_6;

import io.netty.buffer.ByteBuf;
import protocolsupport.protocol.packet.middleimpl.readable.LegacyDynamicLengthPassthroughReadableMiddlePacket;
import protocolsupport.protocol.serializer.TypeCopier;

public class CreativeSetSlotPacket extends LegacyDynamicLengthPassthroughReadableMiddlePacket {

	public static final int PACKET_ID = 0x6B;

	public CreativeSetSlotPacket() {
		super(PACKET_ID);
	}

	@Override
	protected void readTo(ByteBuf data, ByteBuf to) {
		TypeCopier.copyBytes(data, to, Short.BYTES);
		TypeCopier.copyLegacyItemStack(data, to);
	}

}