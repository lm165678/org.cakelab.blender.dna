package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'Image'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=1848, size64=1928)
public class Image extends CFacade {

	/**
	 * This is the sdna index of the struct Image.
	 * <p>
	 * It is required when allocating a new block to store data for Image.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 24;

	/**
	 * Field descriptor (offset) for struct member 'id'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__id);
	 * CPointer&lt;ID&gt; p_id = p.cast(new Class[]{ID.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'id'</li>
	 * <li>Signature: 'ID'</li>
	 * <li>Actual Size (32bit/64bit): 100/120</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__id = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[1024]'</li>
	 * <li>Actual Size (32bit/64bit): 1024/1024</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{100, 120};

	/**
	 * Field descriptor (offset) for struct member 'cache'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__cache);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_cache = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cache'</li>
	 * <li>Signature: 'MovieCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cache = new long[]{1124, 1144};

	/**
	 * Field descriptor (offset) for struct member 'gputexture'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__gputexture);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_gputexture = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gputexture'</li>
	 * <li>Signature: 'GPUTexture*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gputexture = new long[]{1128, 1152};

	/**
	 * Field descriptor (offset) for struct member 'anim'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__anim);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_anim = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'anim'</li>
	 * <li>Signature: 'anim*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__anim = new long[]{1132, 1160};

	/**
	 * Field descriptor (offset) for struct member 'rr'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__rr);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_rr = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rr'</li>
	 * <li>Signature: 'RenderResult*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rr = new long[]{1136, 1168};

	/**
	 * Field descriptor (offset) for struct member 'renders'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__renders);
	 * CPointer&lt;CArrayFacade&lt;CPointer&lt;Object&gt;&gt;&gt; p_renders = p.cast(new Class[]{CArrayFacade.class, CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'renders'</li>
	 * <li>Signature: 'RenderResult*[8]'</li>
	 * <li>Actual Size (32bit/64bit): 32/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__renders = new long[]{1140, 1176};

	/**
	 * Field descriptor (offset) for struct member 'render_slot'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__render_slot);
	 * CPointer&lt;Short&gt; p_render_slot = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'render_slot'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__render_slot = new long[]{1172, 1240};

	/**
	 * Field descriptor (offset) for struct member 'last_render_slot'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__last_render_slot);
	 * CPointer&lt;Short&gt; p_last_render_slot = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'last_render_slot'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__last_render_slot = new long[]{1174, 1242};

	/**
	 * Field descriptor (offset) for struct member 'ok'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__ok);
	 * CPointer&lt;Short&gt; p_ok = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ok'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ok = new long[]{1176, 1244};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{1178, 1246};

	/**
	 * Field descriptor (offset) for struct member 'source'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__source);
	 * CPointer&lt;Short&gt; p_source = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'source'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__source = new long[]{1180, 1248};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{1182, 1250};

	/**
	 * Field descriptor (offset) for struct member 'lastframe'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__lastframe);
	 * CPointer&lt;Integer&gt; p_lastframe = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lastframe'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lastframe = new long[]{1184, 1252};

	/**
	 * Field descriptor (offset) for struct member 'tpageflag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__tpageflag);
	 * CPointer&lt;Short&gt; p_tpageflag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tpageflag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tpageflag = new long[]{1188, 1256};

	/**
	 * Field descriptor (offset) for struct member 'totbind'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__totbind);
	 * CPointer&lt;Short&gt; p_totbind = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totbind'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totbind = new long[]{1190, 1258};

	/**
	 * Field descriptor (offset) for struct member 'xrep'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__xrep);
	 * CPointer&lt;Short&gt; p_xrep = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xrep'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xrep = new long[]{1192, 1260};

	/**
	 * Field descriptor (offset) for struct member 'yrep'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__yrep);
	 * CPointer&lt;Short&gt; p_yrep = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'yrep'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__yrep = new long[]{1194, 1262};

	/**
	 * Field descriptor (offset) for struct member 'twsta'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__twsta);
	 * CPointer&lt;Short&gt; p_twsta = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'twsta'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__twsta = new long[]{1196, 1264};

	/**
	 * Field descriptor (offset) for struct member 'twend'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__twend);
	 * CPointer&lt;Short&gt; p_twend = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'twend'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__twend = new long[]{1198, 1266};

	/**
	 * Field descriptor (offset) for struct member 'bindcode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__bindcode);
	 * CPointer&lt;Integer&gt; p_bindcode = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bindcode'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bindcode = new long[]{1200, 1268};

	/**
	 * Field descriptor (offset) for struct member 'repbind'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__repbind);
	 * CPointer&lt;CPointer&lt;Integer&gt;&gt; p_repbind = p.cast(new Class[]{CPointer.class, Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'repbind'</li>
	 * <li>Signature: 'int*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__repbind = new long[]{1204, 1272};

	/**
	 * Field descriptor (offset) for struct member 'packedfile'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__packedfile);
	 * CPointer&lt;CPointer&lt;PackedFile&gt;&gt; p_packedfile = p.cast(new Class[]{CPointer.class, PackedFile.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'packedfile'</li>
	 * <li>Signature: 'PackedFile*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__packedfile = new long[]{1208, 1280};

	/**
	 * Field descriptor (offset) for struct member 'preview'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__preview);
	 * CPointer&lt;CPointer&lt;PreviewImage&gt;&gt; p_preview = p.cast(new Class[]{CPointer.class, PreviewImage.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'preview'</li>
	 * <li>Signature: 'PreviewImage*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__preview = new long[]{1212, 1288};

	/**
	 * Field descriptor (offset) for struct member 'lastupdate'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__lastupdate);
	 * CPointer&lt;Float&gt; p_lastupdate = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lastupdate'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lastupdate = new long[]{1216, 1296};

	/**
	 * Field descriptor (offset) for struct member 'lastused'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__lastused);
	 * CPointer&lt;Integer&gt; p_lastused = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lastused'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lastused = new long[]{1220, 1300};

	/**
	 * Field descriptor (offset) for struct member 'animspeed'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__animspeed);
	 * CPointer&lt;Short&gt; p_animspeed = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'animspeed'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__animspeed = new long[]{1224, 1304};

	/**
	 * Field descriptor (offset) for struct member 'pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__pad2);
	 * CPointer&lt;Short&gt; p_pad2 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad2'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad2 = new long[]{1226, 1306};

	/**
	 * Field descriptor (offset) for struct member 'gen_x'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__gen_x);
	 * CPointer&lt;Integer&gt; p_gen_x = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gen_x'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gen_x = new long[]{1228, 1308};

	/**
	 * Field descriptor (offset) for struct member 'gen_y'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__gen_y);
	 * CPointer&lt;Integer&gt; p_gen_y = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gen_y'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gen_y = new long[]{1232, 1312};

	/**
	 * Field descriptor (offset) for struct member 'gen_type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__gen_type);
	 * CPointer&lt;Byte&gt; p_gen_type = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gen_type'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gen_type = new long[]{1236, 1316};

	/**
	 * Field descriptor (offset) for struct member 'gen_flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__gen_flag);
	 * CPointer&lt;Byte&gt; p_gen_flag = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gen_flag'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gen_flag = new long[]{1237, 1317};

	/**
	 * Field descriptor (offset) for struct member 'gen_depth'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__gen_depth);
	 * CPointer&lt;Short&gt; p_gen_depth = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gen_depth'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gen_depth = new long[]{1238, 1318};

	/**
	 * Field descriptor (offset) for struct member 'gen_color'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__gen_color);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_gen_color = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gen_color'</li>
	 * <li>Signature: 'float[4]'</li>
	 * <li>Actual Size (32bit/64bit): 16/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gen_color = new long[]{1240, 1320};

	/**
	 * Field descriptor (offset) for struct member 'aspx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__aspx);
	 * CPointer&lt;Float&gt; p_aspx = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aspx'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aspx = new long[]{1256, 1336};

	/**
	 * Field descriptor (offset) for struct member 'aspy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__aspy);
	 * CPointer&lt;Float&gt; p_aspy = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'aspy'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__aspy = new long[]{1260, 1340};

	/**
	 * Field descriptor (offset) for struct member 'colorspace_settings'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__colorspace_settings);
	 * CPointer&lt;ColorManagedColorspaceSettings&gt; p_colorspace_settings = p.cast(new Class[]{ColorManagedColorspaceSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'colorspace_settings'</li>
	 * <li>Signature: 'ColorManagedColorspaceSettings'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__colorspace_settings = new long[]{1264, 1344};

	/**
	 * Field descriptor (offset) for struct member 'alpha_mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__alpha_mode);
	 * CPointer&lt;Byte&gt; p_alpha_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alpha_mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alpha_mode = new long[]{1328, 1408};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__pad);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_pad = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'char[7]'</li>
	 * <li>Actual Size (32bit/64bit): 7/7</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{1329, 1409};

	/**
	 * Field descriptor (offset) for struct member 'render_slots'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * Image image = ...;
	 * CPointer&lt;Object&gt; p = image.__dna__addressof(Image.__DNA__FIELD__render_slots);
	 * CPointer&lt;CArrayFacade&lt;RenderSlot&gt;&gt; p_render_slots = p.cast(new Class[]{CArrayFacade.class, RenderSlot.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'render_slots'</li>
	 * <li>Signature: 'RenderSlot[8]'</li>
	 * <li>Actual Size (32bit/64bit): 512/512</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__render_slots = new long[]{1336, 1416};

	public Image(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected Image(Image that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public ID getId() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ID(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'id'.
	 * @see #__DNA__FIELD__id
	 */
	
	public void setId(ID id) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(id, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, id)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, id);
		} else {
			__io__generic__copy( getId(), id);
		}
	}

	/**
	 * Get method for struct member 'name'.
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			1024
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 120, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 100, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 120;
		} else {
			__dna__offset = 100;
		}
		if (__io__equals(name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, name);
		} else {
			__io__generic__copy( getName(), name);
		}
	}

	/**
	 * Get method for struct member 'cache'.
	 * @see #__DNA__FIELD__cache
	 */
	
	public CPointer<Object> getCache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1124);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cache'.
	 * @see #__DNA__FIELD__cache
	 */
	
	public void setCache(CPointer<Object> cache) throws IOException
	{
		long __address = ((cache == null) ? 0 : cache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1144, __address);
		} else {
			__io__block.writeLong(__io__address + 1124, __address);
		}
	}

	/**
	 * Get method for struct member 'gputexture'.
	 * @see #__DNA__FIELD__gputexture
	 */
	
	public CPointer<Object> getGputexture() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1152);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1128);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gputexture'.
	 * @see #__DNA__FIELD__gputexture
	 */
	
	public void setGputexture(CPointer<Object> gputexture) throws IOException
	{
		long __address = ((gputexture == null) ? 0 : gputexture.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1152, __address);
		} else {
			__io__block.writeLong(__io__address + 1128, __address);
		}
	}

	/**
	 * Get method for struct member 'anim'.
	 * @see #__DNA__FIELD__anim
	 */
	
	public CPointer<Object> getAnim() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1160);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1132);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'anim'.
	 * @see #__DNA__FIELD__anim
	 */
	
	public void setAnim(CPointer<Object> anim) throws IOException
	{
		long __address = ((anim == null) ? 0 : anim.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1160, __address);
		} else {
			__io__block.writeLong(__io__address + 1132, __address);
		}
	}

	/**
	 * Get method for struct member 'rr'.
	 * @see #__DNA__FIELD__rr
	 */
	
	public CPointer<Object> getRr() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1168);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1136);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'rr'.
	 * @see #__DNA__FIELD__rr
	 */
	
	public void setRr(CPointer<Object> rr) throws IOException
	{
		long __address = ((rr == null) ? 0 : rr.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1168, __address);
		} else {
			__io__block.writeLong(__io__address + 1136, __address);
		}
	}

	/**
	 * Get method for struct member 'renders'.
	 * @see #__DNA__FIELD__renders
	 */
	
	public CArrayFacade<CPointer<Object>> getRenders() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, Object.class};
		int[] __dna__dimensions = new int[]{
			8
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CPointer<Object>>(__io__address + 1176, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CPointer<Object>>(__io__address + 1140, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'renders'.
	 * @see #__DNA__FIELD__renders
	 */
	
	public void setRenders(CArrayFacade<CPointer<Object>> renders) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1176;
		} else {
			__dna__offset = 1140;
		}
		if (__io__equals(renders, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, renders)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, renders);
		} else {
			__io__generic__copy( getRenders(), renders);
		}
	}

	/**
	 * Get method for struct member 'render_slot'.
	 * @see #__DNA__FIELD__render_slot
	 */
	
	public short getRender_slot() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1240);
		} else {
			return __io__block.readShort(__io__address + 1172);
		}
	}

	/**
	 * Set method for struct member 'render_slot'.
	 * @see #__DNA__FIELD__render_slot
	 */
	
	public void setRender_slot(short render_slot) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1240, render_slot);
		} else {
			__io__block.writeShort(__io__address + 1172, render_slot);
		}
	}

	/**
	 * Get method for struct member 'last_render_slot'.
	 * @see #__DNA__FIELD__last_render_slot
	 */
	
	public short getLast_render_slot() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1242);
		} else {
			return __io__block.readShort(__io__address + 1174);
		}
	}

	/**
	 * Set method for struct member 'last_render_slot'.
	 * @see #__DNA__FIELD__last_render_slot
	 */
	
	public void setLast_render_slot(short last_render_slot) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1242, last_render_slot);
		} else {
			__io__block.writeShort(__io__address + 1174, last_render_slot);
		}
	}

	/**
	 * Get method for struct member 'ok'.
	 * @see #__DNA__FIELD__ok
	 */
	
	public short getOk() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1244);
		} else {
			return __io__block.readShort(__io__address + 1176);
		}
	}

	/**
	 * Set method for struct member 'ok'.
	 * @see #__DNA__FIELD__ok
	 */
	
	public void setOk(short ok) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1244, ok);
		} else {
			__io__block.writeShort(__io__address + 1176, ok);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1246);
		} else {
			return __io__block.readShort(__io__address + 1178);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1246, flag);
		} else {
			__io__block.writeShort(__io__address + 1178, flag);
		}
	}

	/**
	 * Get method for struct member 'source'.
	 * @see #__DNA__FIELD__source
	 */
	
	public short getSource() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1248);
		} else {
			return __io__block.readShort(__io__address + 1180);
		}
	}

	/**
	 * Set method for struct member 'source'.
	 * @see #__DNA__FIELD__source
	 */
	
	public void setSource(short source) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1248, source);
		} else {
			__io__block.writeShort(__io__address + 1180, source);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1250);
		} else {
			return __io__block.readShort(__io__address + 1182);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1250, type);
		} else {
			__io__block.writeShort(__io__address + 1182, type);
		}
	}

	/**
	 * Get method for struct member 'lastframe'.
	 * @see #__DNA__FIELD__lastframe
	 */
	
	public int getLastframe() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1252);
		} else {
			return __io__block.readInt(__io__address + 1184);
		}
	}

	/**
	 * Set method for struct member 'lastframe'.
	 * @see #__DNA__FIELD__lastframe
	 */
	
	public void setLastframe(int lastframe) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1252, lastframe);
		} else {
			__io__block.writeInt(__io__address + 1184, lastframe);
		}
	}

	/**
	 * Get method for struct member 'tpageflag'.
	 * @see #__DNA__FIELD__tpageflag
	 */
	
	public short getTpageflag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1256);
		} else {
			return __io__block.readShort(__io__address + 1188);
		}
	}

	/**
	 * Set method for struct member 'tpageflag'.
	 * @see #__DNA__FIELD__tpageflag
	 */
	
	public void setTpageflag(short tpageflag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1256, tpageflag);
		} else {
			__io__block.writeShort(__io__address + 1188, tpageflag);
		}
	}

	/**
	 * Get method for struct member 'totbind'.
	 * @see #__DNA__FIELD__totbind
	 */
	
	public short getTotbind() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1258);
		} else {
			return __io__block.readShort(__io__address + 1190);
		}
	}

	/**
	 * Set method for struct member 'totbind'.
	 * @see #__DNA__FIELD__totbind
	 */
	
	public void setTotbind(short totbind) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1258, totbind);
		} else {
			__io__block.writeShort(__io__address + 1190, totbind);
		}
	}

	/**
	 * Get method for struct member 'xrep'.
	 * @see #__DNA__FIELD__xrep
	 */
	
	public short getXrep() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1260);
		} else {
			return __io__block.readShort(__io__address + 1192);
		}
	}

	/**
	 * Set method for struct member 'xrep'.
	 * @see #__DNA__FIELD__xrep
	 */
	
	public void setXrep(short xrep) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1260, xrep);
		} else {
			__io__block.writeShort(__io__address + 1192, xrep);
		}
	}

	/**
	 * Get method for struct member 'yrep'.
	 * @see #__DNA__FIELD__yrep
	 */
	
	public short getYrep() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1262);
		} else {
			return __io__block.readShort(__io__address + 1194);
		}
	}

	/**
	 * Set method for struct member 'yrep'.
	 * @see #__DNA__FIELD__yrep
	 */
	
	public void setYrep(short yrep) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1262, yrep);
		} else {
			__io__block.writeShort(__io__address + 1194, yrep);
		}
	}

	/**
	 * Get method for struct member 'twsta'.
	 * @see #__DNA__FIELD__twsta
	 */
	
	public short getTwsta() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1264);
		} else {
			return __io__block.readShort(__io__address + 1196);
		}
	}

	/**
	 * Set method for struct member 'twsta'.
	 * @see #__DNA__FIELD__twsta
	 */
	
	public void setTwsta(short twsta) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1264, twsta);
		} else {
			__io__block.writeShort(__io__address + 1196, twsta);
		}
	}

	/**
	 * Get method for struct member 'twend'.
	 * @see #__DNA__FIELD__twend
	 */
	
	public short getTwend() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1266);
		} else {
			return __io__block.readShort(__io__address + 1198);
		}
	}

	/**
	 * Set method for struct member 'twend'.
	 * @see #__DNA__FIELD__twend
	 */
	
	public void setTwend(short twend) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1266, twend);
		} else {
			__io__block.writeShort(__io__address + 1198, twend);
		}
	}

	/**
	 * Get method for struct member 'bindcode'.
	 * @see #__DNA__FIELD__bindcode
	 */
	
	public int getBindcode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1268);
		} else {
			return __io__block.readInt(__io__address + 1200);
		}
	}

	/**
	 * Set method for struct member 'bindcode'.
	 * @see #__DNA__FIELD__bindcode
	 */
	
	public void setBindcode(int bindcode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1268, bindcode);
		} else {
			__io__block.writeInt(__io__address + 1200, bindcode);
		}
	}

	/**
	 * Get method for struct member 'repbind'.
	 * @see #__DNA__FIELD__repbind
	 */
	
	public CPointer<Integer> getRepbind() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1272);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1204);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Integer.class};
		return new CPointer<Integer>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'repbind'.
	 * @see #__DNA__FIELD__repbind
	 */
	
	public void setRepbind(CPointer<Integer> repbind) throws IOException
	{
		long __address = ((repbind == null) ? 0 : repbind.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1272, __address);
		} else {
			__io__block.writeLong(__io__address + 1204, __address);
		}
	}

	/**
	 * Get method for struct member 'packedfile'.
	 * @see #__DNA__FIELD__packedfile
	 */
	
	public CPointer<PackedFile> getPackedfile() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1280);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1208);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PackedFile.class};
		return new CPointer<PackedFile>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PackedFile.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'packedfile'.
	 * @see #__DNA__FIELD__packedfile
	 */
	
	public void setPackedfile(CPointer<PackedFile> packedfile) throws IOException
	{
		long __address = ((packedfile == null) ? 0 : packedfile.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1280, __address);
		} else {
			__io__block.writeLong(__io__address + 1208, __address);
		}
	}

	/**
	 * Get method for struct member 'preview'.
	 * @see #__DNA__FIELD__preview
	 */
	
	public CPointer<PreviewImage> getPreview() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 1288);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 1212);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PreviewImage.class};
		return new CPointer<PreviewImage>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PreviewImage.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'preview'.
	 * @see #__DNA__FIELD__preview
	 */
	
	public void setPreview(CPointer<PreviewImage> preview) throws IOException
	{
		long __address = ((preview == null) ? 0 : preview.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 1288, __address);
		} else {
			__io__block.writeLong(__io__address + 1212, __address);
		}
	}

	/**
	 * Get method for struct member 'lastupdate'.
	 * @see #__DNA__FIELD__lastupdate
	 */
	
	public float getLastupdate() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1296);
		} else {
			return __io__block.readFloat(__io__address + 1216);
		}
	}

	/**
	 * Set method for struct member 'lastupdate'.
	 * @see #__DNA__FIELD__lastupdate
	 */
	
	public void setLastupdate(float lastupdate) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1296, lastupdate);
		} else {
			__io__block.writeFloat(__io__address + 1216, lastupdate);
		}
	}

	/**
	 * Get method for struct member 'lastused'.
	 * @see #__DNA__FIELD__lastused
	 */
	
	public int getLastused() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1300);
		} else {
			return __io__block.readInt(__io__address + 1220);
		}
	}

	/**
	 * Set method for struct member 'lastused'.
	 * @see #__DNA__FIELD__lastused
	 */
	
	public void setLastused(int lastused) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1300, lastused);
		} else {
			__io__block.writeInt(__io__address + 1220, lastused);
		}
	}

	/**
	 * Get method for struct member 'animspeed'.
	 * @see #__DNA__FIELD__animspeed
	 */
	
	public short getAnimspeed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1304);
		} else {
			return __io__block.readShort(__io__address + 1224);
		}
	}

	/**
	 * Set method for struct member 'animspeed'.
	 * @see #__DNA__FIELD__animspeed
	 */
	
	public void setAnimspeed(short animspeed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1304, animspeed);
		} else {
			__io__block.writeShort(__io__address + 1224, animspeed);
		}
	}

	/**
	 * Get method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public short getPad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1306);
		} else {
			return __io__block.readShort(__io__address + 1226);
		}
	}

	/**
	 * Set method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public void setPad2(short pad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1306, pad2);
		} else {
			__io__block.writeShort(__io__address + 1226, pad2);
		}
	}

	/**
	 * Get method for struct member 'gen_x'.
	 * @see #__DNA__FIELD__gen_x
	 */
	
	public int getGen_x() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1308);
		} else {
			return __io__block.readInt(__io__address + 1228);
		}
	}

	/**
	 * Set method for struct member 'gen_x'.
	 * @see #__DNA__FIELD__gen_x
	 */
	
	public void setGen_x(int gen_x) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1308, gen_x);
		} else {
			__io__block.writeInt(__io__address + 1228, gen_x);
		}
	}

	/**
	 * Get method for struct member 'gen_y'.
	 * @see #__DNA__FIELD__gen_y
	 */
	
	public int getGen_y() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 1312);
		} else {
			return __io__block.readInt(__io__address + 1232);
		}
	}

	/**
	 * Set method for struct member 'gen_y'.
	 * @see #__DNA__FIELD__gen_y
	 */
	
	public void setGen_y(int gen_y) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 1312, gen_y);
		} else {
			__io__block.writeInt(__io__address + 1232, gen_y);
		}
	}

	/**
	 * Get method for struct member 'gen_type'.
	 * @see #__DNA__FIELD__gen_type
	 */
	
	public byte getGen_type() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1316);
		} else {
			return __io__block.readByte(__io__address + 1236);
		}
	}

	/**
	 * Set method for struct member 'gen_type'.
	 * @see #__DNA__FIELD__gen_type
	 */
	
	public void setGen_type(byte gen_type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1316, gen_type);
		} else {
			__io__block.writeByte(__io__address + 1236, gen_type);
		}
	}

	/**
	 * Get method for struct member 'gen_flag'.
	 * @see #__DNA__FIELD__gen_flag
	 */
	
	public byte getGen_flag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1317);
		} else {
			return __io__block.readByte(__io__address + 1237);
		}
	}

	/**
	 * Set method for struct member 'gen_flag'.
	 * @see #__DNA__FIELD__gen_flag
	 */
	
	public void setGen_flag(byte gen_flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1317, gen_flag);
		} else {
			__io__block.writeByte(__io__address + 1237, gen_flag);
		}
	}

	/**
	 * Get method for struct member 'gen_depth'.
	 * @see #__DNA__FIELD__gen_depth
	 */
	
	public short getGen_depth() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 1318);
		} else {
			return __io__block.readShort(__io__address + 1238);
		}
	}

	/**
	 * Set method for struct member 'gen_depth'.
	 * @see #__DNA__FIELD__gen_depth
	 */
	
	public void setGen_depth(short gen_depth) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 1318, gen_depth);
		} else {
			__io__block.writeShort(__io__address + 1238, gen_depth);
		}
	}

	/**
	 * Get method for struct member 'gen_color'.
	 * @see #__DNA__FIELD__gen_color
	 */
	
	public CArrayFacade<Float> getGen_color() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 1320, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 1240, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'gen_color'.
	 * @see #__DNA__FIELD__gen_color
	 */
	
	public void setGen_color(CArrayFacade<Float> gen_color) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1320;
		} else {
			__dna__offset = 1240;
		}
		if (__io__equals(gen_color, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, gen_color)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, gen_color);
		} else {
			__io__generic__copy( getGen_color(), gen_color);
		}
	}

	/**
	 * Get method for struct member 'aspx'.
	 * @see #__DNA__FIELD__aspx
	 */
	
	public float getAspx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1336);
		} else {
			return __io__block.readFloat(__io__address + 1256);
		}
	}

	/**
	 * Set method for struct member 'aspx'.
	 * @see #__DNA__FIELD__aspx
	 */
	
	public void setAspx(float aspx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1336, aspx);
		} else {
			__io__block.writeFloat(__io__address + 1256, aspx);
		}
	}

	/**
	 * Get method for struct member 'aspy'.
	 * @see #__DNA__FIELD__aspy
	 */
	
	public float getAspy() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 1340);
		} else {
			return __io__block.readFloat(__io__address + 1260);
		}
	}

	/**
	 * Set method for struct member 'aspy'.
	 * @see #__DNA__FIELD__aspy
	 */
	
	public void setAspy(float aspy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 1340, aspy);
		} else {
			__io__block.writeFloat(__io__address + 1260, aspy);
		}
	}

	/**
	 * Get method for struct member 'colorspace_settings'.
	 * @see #__DNA__FIELD__colorspace_settings
	 */
	
	public ColorManagedColorspaceSettings getColorspace_settings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ColorManagedColorspaceSettings(__io__address + 1344, __io__block, __io__blockTable);
		} else {
			return new ColorManagedColorspaceSettings(__io__address + 1264, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'colorspace_settings'.
	 * @see #__DNA__FIELD__colorspace_settings
	 */
	
	public void setColorspace_settings(ColorManagedColorspaceSettings colorspace_settings) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1344;
		} else {
			__dna__offset = 1264;
		}
		if (__io__equals(colorspace_settings, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, colorspace_settings)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, colorspace_settings);
		} else {
			__io__generic__copy( getColorspace_settings(), colorspace_settings);
		}
	}

	/**
	 * Get method for struct member 'alpha_mode'.
	 * @see #__DNA__FIELD__alpha_mode
	 */
	
	public byte getAlpha_mode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 1408);
		} else {
			return __io__block.readByte(__io__address + 1328);
		}
	}

	/**
	 * Set method for struct member 'alpha_mode'.
	 * @see #__DNA__FIELD__alpha_mode
	 */
	
	public void setAlpha_mode(byte alpha_mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 1408, alpha_mode);
		} else {
			__io__block.writeByte(__io__address + 1328, alpha_mode);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public CArrayFacade<Byte> getPad() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			7
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 1409, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 1329, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(CArrayFacade<Byte> pad) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1409;
		} else {
			__dna__offset = 1329;
		}
		if (__io__equals(pad, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pad)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pad);
		} else {
			__io__generic__copy( getPad(), pad);
		}
	}

	/**
	 * Get method for struct member 'render_slots'.
	 * @see #__DNA__FIELD__render_slots
	 */
	
	public CArrayFacade<RenderSlot> getRender_slots() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{RenderSlot.class};
		int[] __dna__dimensions = new int[]{
			8
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<RenderSlot>(__io__address + 1416, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<RenderSlot>(__io__address + 1336, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'render_slots'.
	 * @see #__DNA__FIELD__render_slots
	 */
	
	public void setRender_slots(CArrayFacade<RenderSlot> render_slots) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 1416;
		} else {
			__dna__offset = 1336;
		}
		if (__io__equals(render_slots, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, render_slots)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, render_slots);
		} else {
			__io__generic__copy( getRender_slots(), render_slots);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<Image> __io__addressof() {
		return new CPointer<Image>(__io__address, new Class[]{Image.class}, __io__block, __io__blockTable);
	}

}
