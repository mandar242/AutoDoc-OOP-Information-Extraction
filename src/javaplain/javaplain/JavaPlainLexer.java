// $ANTLR 3.5.1 C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g 2020-12-12 23:33:41

package javaplain;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class JavaPlainLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int T__104=104;
	public static final int T__105=105;
	public static final int T__106=106;
	public static final int T__107=107;
	public static final int T__108=108;
	public static final int T__109=109;
	public static final int T__110=110;
	public static final int T__111=111;
	public static final int T__112=112;
	public static final int T__113=113;
	public static final int T__114=114;
	public static final int ASSERT=4;
	public static final int COMMENT=5;
	public static final int CharacterLiteral=6;
	public static final int DecimalLiteral=7;
	public static final int ENUM=8;
	public static final int EscapeSequence=9;
	public static final int Exponent=10;
	public static final int FloatTypeSuffix=11;
	public static final int FloatingPointLiteral=12;
	public static final int HexDigit=13;
	public static final int HexLiteral=14;
	public static final int Identifier=15;
	public static final int IntegerTypeSuffix=16;
	public static final int JavaIDDigit=17;
	public static final int LINE_COMMENT=18;
	public static final int Letter=19;
	public static final int OctalEscape=20;
	public static final int OctalLiteral=21;
	public static final int StringLiteral=22;
	public static final int UnicodeEscape=23;
	public static final int WS=24;

	  protected boolean enumIsKeyword = true;
	  protected boolean assertIsKeyword = true;


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public JavaPlainLexer() {} 
	public JavaPlainLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public JavaPlainLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g"; }

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:10:7: ( '!' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:10:9: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:11:7: ( '!=' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:11:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:12:7: ( '%' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:12:9: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:13:7: ( '%=' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:13:9: '%='
			{
			match("%="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:14:7: ( '&&' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:14:9: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:15:7: ( '&' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:15:9: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:16:7: ( '&=' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:16:9: '&='
			{
			match("&="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:17:7: ( '(' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:17:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:18:7: ( ')' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:18:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:19:7: ( '*' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:19:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:20:7: ( '*=' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:20:9: '*='
			{
			match("*="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:21:7: ( '+' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:21:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:22:7: ( '++' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:22:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:23:7: ( '+=' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:23:9: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:24:7: ( ',' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:24:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:25:7: ( '-' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:25:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:26:7: ( '--' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:26:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:27:7: ( '-=' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:27:9: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:28:7: ( '.' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:28:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:29:7: ( '...' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:29:9: '...'
			{
			match("..."); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:30:7: ( '/' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:30:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:31:7: ( '/=' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:31:9: '/='
			{
			match("/="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:32:7: ( ':' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:32:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:33:7: ( ';' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:33:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:34:7: ( '<' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:34:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:35:7: ( '=' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:35:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:36:7: ( '==' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:36:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:37:7: ( '>' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:37:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:38:7: ( '?' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:38:9: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:39:7: ( '@' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:39:9: '@'
			{
			match('@'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:40:7: ( 'String' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:40:9: 'String'
			{
			match("String"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:41:7: ( '[' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:41:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:42:7: ( ']' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:42:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:43:7: ( '^' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:43:9: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:44:7: ( '^=' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:44:9: '^='
			{
			match("^="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:45:7: ( 'abstract' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:45:9: 'abstract'
			{
			match("abstract"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:46:7: ( 'boolean' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:46:9: 'boolean'
			{
			match("boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:47:7: ( 'break' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:47:9: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:48:7: ( 'byte' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:48:9: 'byte'
			{
			match("byte"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:49:7: ( 'case' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:49:9: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:50:7: ( 'catch' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:50:9: 'catch'
			{
			match("catch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:51:7: ( 'char' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:51:9: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:52:7: ( 'class' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:52:9: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:53:7: ( 'continue' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:53:9: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:54:7: ( 'default' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:54:9: 'default'
			{
			match("default"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:55:7: ( 'do' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:55:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:56:7: ( 'double' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:56:9: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:57:7: ( 'else' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:57:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:58:7: ( 'extends' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:58:9: 'extends'
			{
			match("extends"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:59:7: ( 'false' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:59:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:60:7: ( 'final' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:60:9: 'final'
			{
			match("final"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:61:7: ( 'finally' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:61:9: 'finally'
			{
			match("finally"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:62:7: ( 'float' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:62:9: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:63:7: ( 'for' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:63:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:64:7: ( 'if' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:64:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__79"

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:65:7: ( 'implements' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:65:9: 'implements'
			{
			match("implements"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__80"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:66:7: ( 'import' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:66:9: 'import'
			{
			match("import"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__81"

	// $ANTLR start "T__82"
	public final void mT__82() throws RecognitionException {
		try {
			int _type = T__82;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:67:7: ( 'instanceof' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:67:9: 'instanceof'
			{
			match("instanceof"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__82"

	// $ANTLR start "T__83"
	public final void mT__83() throws RecognitionException {
		try {
			int _type = T__83;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:68:7: ( 'int' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:68:9: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__83"

	// $ANTLR start "T__84"
	public final void mT__84() throws RecognitionException {
		try {
			int _type = T__84;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:69:7: ( 'interface' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:69:9: 'interface'
			{
			match("interface"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__84"

	// $ANTLR start "T__85"
	public final void mT__85() throws RecognitionException {
		try {
			int _type = T__85;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:70:7: ( 'long' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:70:9: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__85"

	// $ANTLR start "T__86"
	public final void mT__86() throws RecognitionException {
		try {
			int _type = T__86;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:71:7: ( 'native' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:71:9: 'native'
			{
			match("native"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__86"

	// $ANTLR start "T__87"
	public final void mT__87() throws RecognitionException {
		try {
			int _type = T__87;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:72:7: ( 'new' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:72:9: 'new'
			{
			match("new"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__87"

	// $ANTLR start "T__88"
	public final void mT__88() throws RecognitionException {
		try {
			int _type = T__88;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:73:7: ( 'null' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:73:9: 'null'
			{
			match("null"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__88"

	// $ANTLR start "T__89"
	public final void mT__89() throws RecognitionException {
		try {
			int _type = T__89;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:74:7: ( 'package' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:74:9: 'package'
			{
			match("package"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__89"

	// $ANTLR start "T__90"
	public final void mT__90() throws RecognitionException {
		try {
			int _type = T__90;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:75:7: ( 'private' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:75:9: 'private'
			{
			match("private"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__90"

	// $ANTLR start "T__91"
	public final void mT__91() throws RecognitionException {
		try {
			int _type = T__91;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:76:7: ( 'protected' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:76:9: 'protected'
			{
			match("protected"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__91"

	// $ANTLR start "T__92"
	public final void mT__92() throws RecognitionException {
		try {
			int _type = T__92;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:77:7: ( 'public' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:77:9: 'public'
			{
			match("public"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__92"

	// $ANTLR start "T__93"
	public final void mT__93() throws RecognitionException {
		try {
			int _type = T__93;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:78:7: ( 'return' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:78:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__93"

	// $ANTLR start "T__94"
	public final void mT__94() throws RecognitionException {
		try {
			int _type = T__94;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:79:7: ( 'short' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:79:9: 'short'
			{
			match("short"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__94"

	// $ANTLR start "T__95"
	public final void mT__95() throws RecognitionException {
		try {
			int _type = T__95;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:80:7: ( 'static' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:80:9: 'static'
			{
			match("static"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__95"

	// $ANTLR start "T__96"
	public final void mT__96() throws RecognitionException {
		try {
			int _type = T__96;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:81:7: ( 'strictfp' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:81:9: 'strictfp'
			{
			match("strictfp"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__96"

	// $ANTLR start "T__97"
	public final void mT__97() throws RecognitionException {
		try {
			int _type = T__97;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:82:7: ( 'super' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:82:9: 'super'
			{
			match("super"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__97"

	// $ANTLR start "T__98"
	public final void mT__98() throws RecognitionException {
		try {
			int _type = T__98;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:83:7: ( 'switch' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:83:9: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__98"

	// $ANTLR start "T__99"
	public final void mT__99() throws RecognitionException {
		try {
			int _type = T__99;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:84:7: ( 'synchronized' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:84:9: 'synchronized'
			{
			match("synchronized"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__99"

	// $ANTLR start "T__100"
	public final void mT__100() throws RecognitionException {
		try {
			int _type = T__100;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:85:8: ( 'this' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:85:10: 'this'
			{
			match("this"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__100"

	// $ANTLR start "T__101"
	public final void mT__101() throws RecognitionException {
		try {
			int _type = T__101;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:86:8: ( 'throw' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:86:10: 'throw'
			{
			match("throw"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__101"

	// $ANTLR start "T__102"
	public final void mT__102() throws RecognitionException {
		try {
			int _type = T__102;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:87:8: ( 'throws' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:87:10: 'throws'
			{
			match("throws"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__102"

	// $ANTLR start "T__103"
	public final void mT__103() throws RecognitionException {
		try {
			int _type = T__103;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:88:8: ( 'transient' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:88:10: 'transient'
			{
			match("transient"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__103"

	// $ANTLR start "T__104"
	public final void mT__104() throws RecognitionException {
		try {
			int _type = T__104;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:89:8: ( 'true' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:89:10: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__104"

	// $ANTLR start "T__105"
	public final void mT__105() throws RecognitionException {
		try {
			int _type = T__105;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:90:8: ( 'try' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:90:10: 'try'
			{
			match("try"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__105"

	// $ANTLR start "T__106"
	public final void mT__106() throws RecognitionException {
		try {
			int _type = T__106;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:91:8: ( 'void' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:91:10: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__106"

	// $ANTLR start "T__107"
	public final void mT__107() throws RecognitionException {
		try {
			int _type = T__107;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:92:8: ( 'volatile' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:92:10: 'volatile'
			{
			match("volatile"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__107"

	// $ANTLR start "T__108"
	public final void mT__108() throws RecognitionException {
		try {
			int _type = T__108;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:93:8: ( 'while' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:93:10: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__108"

	// $ANTLR start "T__109"
	public final void mT__109() throws RecognitionException {
		try {
			int _type = T__109;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:94:8: ( '{' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:94:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__109"

	// $ANTLR start "T__110"
	public final void mT__110() throws RecognitionException {
		try {
			int _type = T__110;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:95:8: ( '|' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:95:10: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__110"

	// $ANTLR start "T__111"
	public final void mT__111() throws RecognitionException {
		try {
			int _type = T__111;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:96:8: ( '|=' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:96:10: '|='
			{
			match("|="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__111"

	// $ANTLR start "T__112"
	public final void mT__112() throws RecognitionException {
		try {
			int _type = T__112;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:97:8: ( '||' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:97:10: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__112"

	// $ANTLR start "T__113"
	public final void mT__113() throws RecognitionException {
		try {
			int _type = T__113;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:98:8: ( '}' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:98:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__113"

	// $ANTLR start "T__114"
	public final void mT__114() throws RecognitionException {
		try {
			int _type = T__114;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:99:8: ( '~' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:99:10: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__114"

	// $ANTLR start "HexLiteral"
	public final void mHexLiteral() throws RecognitionException {
		try {
			int _type = HexLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1067:12: ( '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )? )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1067:14: '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )?
			{
			match('0'); 
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1067:28: ( HexDigit )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'F')||(LA1_0 >= 'a' && LA1_0 <= 'f')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1067:38: ( IntegerTypeSuffix )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='L'||LA2_0=='l') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:
					{
					if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HexLiteral"

	// $ANTLR start "DecimalLiteral"
	public final void mDecimalLiteral() throws RecognitionException {
		try {
			int _type = DecimalLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1069:16: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )? )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1069:18: ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )?
			{
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1069:18: ( '0' | '1' .. '9' ( '0' .. '9' )* )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='0') ) {
				alt4=1;
			}
			else if ( ((LA4_0 >= '1' && LA4_0 <= '9')) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1069:19: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1069:25: '1' .. '9' ( '0' .. '9' )*
					{
					matchRange('1','9'); 
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1069:34: ( '0' .. '9' )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop3;
						}
					}

					}
					break;

			}

			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1069:45: ( IntegerTypeSuffix )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='L'||LA5_0=='l') ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:
					{
					if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DecimalLiteral"

	// $ANTLR start "OctalLiteral"
	public final void mOctalLiteral() throws RecognitionException {
		try {
			int _type = OctalLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1071:14: ( '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )? )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1071:16: '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )?
			{
			match('0'); 
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1071:20: ( '0' .. '7' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '7')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1071:32: ( IntegerTypeSuffix )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='L'||LA7_0=='l') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:
					{
					if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OctalLiteral"

	// $ANTLR start "HexDigit"
	public final void mHexDigit() throws RecognitionException {
		try {
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1075:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HexDigit"

	// $ANTLR start "IntegerTypeSuffix"
	public final void mIntegerTypeSuffix() throws RecognitionException {
		try {
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1078:19: ( ( 'l' | 'L' ) )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:
			{
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IntegerTypeSuffix"

	// $ANTLR start "FloatingPointLiteral"
	public final void mFloatingPointLiteral() throws RecognitionException {
		try {
			int _type = FloatingPointLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1080:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ FloatTypeSuffix )
			int alt18=4;
			alt18 = dfa18.predict(input);
			switch (alt18) {
				case 1 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1080:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )?
					{
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1080:9: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					match('.'); 
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1080:25: ( '0' .. '9' )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop9;
						}
					}

					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1080:37: ( Exponent )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='E'||LA10_0=='e') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1080:37: Exponent
							{
							mExponent(); 

							}
							break;

					}

					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1080:47: ( FloatTypeSuffix )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='D'||LA11_0=='F'||LA11_0=='d'||LA11_0=='f') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:
							{
							if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1081:9: '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )?
					{
					match('.'); 
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1081:13: ( '0' .. '9' )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1081:25: ( Exponent )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0=='E'||LA13_0=='e') ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1081:25: Exponent
							{
							mExponent(); 

							}
							break;

					}

					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1081:35: ( FloatTypeSuffix )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0=='D'||LA14_0=='F'||LA14_0=='d'||LA14_0=='f') ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:
							{
							if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1082:9: ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )?
					{
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1082:9: ( '0' .. '9' )+
					int cnt15=0;
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt15 >= 1 ) break loop15;
							EarlyExitException eee = new EarlyExitException(15, input);
							throw eee;
						}
						cnt15++;
					}

					mExponent(); 

					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1082:30: ( FloatTypeSuffix )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0=='D'||LA16_0=='F'||LA16_0=='d'||LA16_0=='f') ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:
							{
							if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 4 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1083:9: ( '0' .. '9' )+ FloatTypeSuffix
					{
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1083:9: ( '0' .. '9' )+
					int cnt17=0;
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt17 >= 1 ) break loop17;
							EarlyExitException eee = new EarlyExitException(17, input);
							throw eee;
						}
						cnt17++;
					}

					mFloatTypeSuffix(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FloatingPointLiteral"

	// $ANTLR start "Exponent"
	public final void mExponent() throws RecognitionException {
		try {
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1088:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1088:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1088:22: ( '+' | '-' )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='+'||LA19_0=='-') ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1088:33: ( '0' .. '9' )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= '0' && LA20_0 <= '9')) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Exponent"

	// $ANTLR start "FloatTypeSuffix"
	public final void mFloatTypeSuffix() throws RecognitionException {
		try {
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1091:17: ( ( 'f' | 'F' | 'd' | 'D' ) )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:
			{
			if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FloatTypeSuffix"

	// $ANTLR start "CharacterLiteral"
	public final void mCharacterLiteral() throws RecognitionException {
		try {
			int _type = CharacterLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1093:5: ( '\\'' ( EscapeSequence |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1093:9: '\\'' ( EscapeSequence |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1093:14: ( EscapeSequence |~ ( '\\'' | '\\\\' ) )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='\\') ) {
				alt21=1;
			}
			else if ( ((LA21_0 >= '\u0000' && LA21_0 <= '&')||(LA21_0 >= '(' && LA21_0 <= '[')||(LA21_0 >= ']' && LA21_0 <= '\uFFFF')) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1093:16: EscapeSequence
					{
					mEscapeSequence(); 

					}
					break;
				case 2 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1093:33: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CharacterLiteral"

	// $ANTLR start "StringLiteral"
	public final void mStringLiteral() throws RecognitionException {
		try {
			int _type = StringLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1097:5: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1097:8: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1097:12: ( EscapeSequence |~ ( '\\\\' | '\"' ) )*
			loop22:
			while (true) {
				int alt22=3;
				int LA22_0 = input.LA(1);
				if ( (LA22_0=='\\') ) {
					alt22=1;
				}
				else if ( ((LA22_0 >= '\u0000' && LA22_0 <= '!')||(LA22_0 >= '#' && LA22_0 <= '[')||(LA22_0 >= ']' && LA22_0 <= '\uFFFF')) ) {
					alt22=2;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1097:14: EscapeSequence
					{
					mEscapeSequence(); 

					}
					break;
				case 2 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1097:31: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop22;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "StringLiteral"

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1103:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
			int alt23=3;
			int LA23_0 = input.LA(1);
			if ( (LA23_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt23=1;
					}
					break;
				case 'u':
					{
					alt23=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt23=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1103:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1104:9: UnicodeEscape
					{
					mUnicodeEscape(); 

					}
					break;
				case 3 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1105:9: OctalEscape
					{
					mOctalEscape(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EscapeSequence"

	// $ANTLR start "OctalEscape"
	public final void mOctalEscape() throws RecognitionException {
		try {
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1110:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt24=3;
			int LA24_0 = input.LA(1);
			if ( (LA24_0=='\\') ) {
				int LA24_1 = input.LA(2);
				if ( ((LA24_1 >= '0' && LA24_1 <= '3')) ) {
					int LA24_2 = input.LA(3);
					if ( ((LA24_2 >= '0' && LA24_2 <= '7')) ) {
						int LA24_4 = input.LA(4);
						if ( ((LA24_4 >= '0' && LA24_4 <= '7')) ) {
							alt24=1;
						}

						else {
							alt24=2;
						}

					}

					else {
						alt24=3;
					}

				}
				else if ( ((LA24_1 >= '4' && LA24_1 <= '7')) ) {
					int LA24_3 = input.LA(3);
					if ( ((LA24_3 >= '0' && LA24_3 <= '7')) ) {
						alt24=2;
					}

					else {
						alt24=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1110:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1111:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1112:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OctalEscape"

	// $ANTLR start "UnicodeEscape"
	public final void mUnicodeEscape() throws RecognitionException {
		try {
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1117:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1117:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
			{
			match('\\'); 
			match('u'); 
			mHexDigit(); 

			mHexDigit(); 

			mHexDigit(); 

			mHexDigit(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UnicodeEscape"

	// $ANTLR start "ENUM"
	public final void mENUM() throws RecognitionException {
		try {
			int _type = ENUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1119:5: ( 'enum' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1119:9: 'enum'
			{
			match("enum"); 

			if (!enumIsKeyword) _type=Identifier;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENUM"

	// $ANTLR start "ASSERT"
	public final void mASSERT() throws RecognitionException {
		try {
			int _type = ASSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1123:5: ( 'assert' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1123:9: 'assert'
			{
			match("assert"); 

			if (!assertIsKeyword) _type=Identifier;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSERT"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1127:5: ( Letter ( Letter | JavaIDDigit )* )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1127:9: Letter ( Letter | JavaIDDigit )*
			{
			mLetter(); 

			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1127:16: ( Letter | JavaIDDigit )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0=='$'||(LA25_0 >= '0' && LA25_0 <= '9')||(LA25_0 >= 'A' && LA25_0 <= 'Z')||LA25_0=='_'||(LA25_0 >= 'a' && LA25_0 <= 'z')||(LA25_0 >= '\u00C0' && LA25_0 <= '\u00D6')||(LA25_0 >= '\u00D8' && LA25_0 <= '\u00F6')||(LA25_0 >= '\u00F8' && LA25_0 <= '\u1FFF')||(LA25_0 >= '\u3040' && LA25_0 <= '\u318F')||(LA25_0 >= '\u3300' && LA25_0 <= '\u337F')||(LA25_0 >= '\u3400' && LA25_0 <= '\u3D2D')||(LA25_0 >= '\u4E00' && LA25_0 <= '\u9FFF')||(LA25_0 >= '\uF900' && LA25_0 <= '\uFAFF')) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:
					{
					if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u3040' && input.LA(1) <= '\u318F')||(input.LA(1) >= '\u3300' && input.LA(1) <= '\u337F')||(input.LA(1) >= '\u3400' && input.LA(1) <= '\u3D2D')||(input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FFF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFAFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop25;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "Letter"
	public final void mLetter() throws RecognitionException {
		try {
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1139:5: ( '\\u0024' | '\\u0041' .. '\\u005a' | '\\u005f' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u3040' && input.LA(1) <= '\u318F')||(input.LA(1) >= '\u3300' && input.LA(1) <= '\u337F')||(input.LA(1) >= '\u3400' && input.LA(1) <= '\u3D2D')||(input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FFF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFAFF') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Letter"

	// $ANTLR start "JavaIDDigit"
	public final void mJavaIDDigit() throws RecognitionException {
		try {
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1153:5: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06f0' .. '\\u06f9' | '\\u0966' .. '\\u096f' | '\\u09e6' .. '\\u09ef' | '\\u0a66' .. '\\u0a6f' | '\\u0ae6' .. '\\u0aef' | '\\u0b66' .. '\\u0b6f' | '\\u0be7' .. '\\u0bef' | '\\u0c66' .. '\\u0c6f' | '\\u0ce6' .. '\\u0cef' | '\\u0d66' .. '\\u0d6f' | '\\u0e50' .. '\\u0e59' | '\\u0ed0' .. '\\u0ed9' | '\\u1040' .. '\\u1049' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= '\u0660' && input.LA(1) <= '\u0669')||(input.LA(1) >= '\u06F0' && input.LA(1) <= '\u06F9')||(input.LA(1) >= '\u0966' && input.LA(1) <= '\u096F')||(input.LA(1) >= '\u09E6' && input.LA(1) <= '\u09EF')||(input.LA(1) >= '\u0A66' && input.LA(1) <= '\u0A6F')||(input.LA(1) >= '\u0AE6' && input.LA(1) <= '\u0AEF')||(input.LA(1) >= '\u0B66' && input.LA(1) <= '\u0B6F')||(input.LA(1) >= '\u0BE7' && input.LA(1) <= '\u0BEF')||(input.LA(1) >= '\u0C66' && input.LA(1) <= '\u0C6F')||(input.LA(1) >= '\u0CE6' && input.LA(1) <= '\u0CEF')||(input.LA(1) >= '\u0D66' && input.LA(1) <= '\u0D6F')||(input.LA(1) >= '\u0E50' && input.LA(1) <= '\u0E59')||(input.LA(1) >= '\u0ED0' && input.LA(1) <= '\u0ED9')||(input.LA(1) >= '\u1040' && input.LA(1) <= '\u1049') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JavaIDDigit"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1169:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1169:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1173:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1173:9: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1173:14: ( options {greedy=false; } : . )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0=='*') ) {
					int LA26_1 = input.LA(2);
					if ( (LA26_1=='/') ) {
						alt26=2;
					}
					else if ( ((LA26_1 >= '\u0000' && LA26_1 <= '.')||(LA26_1 >= '0' && LA26_1 <= '\uFFFF')) ) {
						alt26=1;
					}

				}
				else if ( ((LA26_0 >= '\u0000' && LA26_0 <= ')')||(LA26_0 >= '+' && LA26_0 <= '\uFFFF')) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1173:42: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop26;
				}
			}

			match("*/"); 

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "LINE_COMMENT"
	public final void mLINE_COMMENT() throws RecognitionException {
		try {
			int _type = LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1177:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1177:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1177:12: (~ ( '\\n' | '\\r' ) )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( ((LA27_0 >= '\u0000' && LA27_0 <= '\t')||(LA27_0 >= '\u000B' && LA27_0 <= '\f')||(LA27_0 >= '\u000E' && LA27_0 <= '\uFFFF')) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop27;
				}
			}

			// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1177:26: ( '\\r' )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0=='\r') ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1177:26: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:8: ( T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | HexLiteral | DecimalLiteral | OctalLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | ENUM | ASSERT | Identifier | WS | COMMENT | LINE_COMMENT )
		int alt29=102;
		alt29 = dfa29.predict(input);
		switch (alt29) {
			case 1 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:10: T__25
				{
				mT__25(); 

				}
				break;
			case 2 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:16: T__26
				{
				mT__26(); 

				}
				break;
			case 3 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:22: T__27
				{
				mT__27(); 

				}
				break;
			case 4 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:28: T__28
				{
				mT__28(); 

				}
				break;
			case 5 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:34: T__29
				{
				mT__29(); 

				}
				break;
			case 6 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:40: T__30
				{
				mT__30(); 

				}
				break;
			case 7 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:46: T__31
				{
				mT__31(); 

				}
				break;
			case 8 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:52: T__32
				{
				mT__32(); 

				}
				break;
			case 9 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:58: T__33
				{
				mT__33(); 

				}
				break;
			case 10 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:64: T__34
				{
				mT__34(); 

				}
				break;
			case 11 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:70: T__35
				{
				mT__35(); 

				}
				break;
			case 12 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:76: T__36
				{
				mT__36(); 

				}
				break;
			case 13 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:82: T__37
				{
				mT__37(); 

				}
				break;
			case 14 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:88: T__38
				{
				mT__38(); 

				}
				break;
			case 15 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:94: T__39
				{
				mT__39(); 

				}
				break;
			case 16 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:100: T__40
				{
				mT__40(); 

				}
				break;
			case 17 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:106: T__41
				{
				mT__41(); 

				}
				break;
			case 18 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:112: T__42
				{
				mT__42(); 

				}
				break;
			case 19 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:118: T__43
				{
				mT__43(); 

				}
				break;
			case 20 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:124: T__44
				{
				mT__44(); 

				}
				break;
			case 21 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:130: T__45
				{
				mT__45(); 

				}
				break;
			case 22 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:136: T__46
				{
				mT__46(); 

				}
				break;
			case 23 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:142: T__47
				{
				mT__47(); 

				}
				break;
			case 24 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:148: T__48
				{
				mT__48(); 

				}
				break;
			case 25 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:154: T__49
				{
				mT__49(); 

				}
				break;
			case 26 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:160: T__50
				{
				mT__50(); 

				}
				break;
			case 27 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:166: T__51
				{
				mT__51(); 

				}
				break;
			case 28 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:172: T__52
				{
				mT__52(); 

				}
				break;
			case 29 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:178: T__53
				{
				mT__53(); 

				}
				break;
			case 30 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:184: T__54
				{
				mT__54(); 

				}
				break;
			case 31 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:190: T__55
				{
				mT__55(); 

				}
				break;
			case 32 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:196: T__56
				{
				mT__56(); 

				}
				break;
			case 33 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:202: T__57
				{
				mT__57(); 

				}
				break;
			case 34 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:208: T__58
				{
				mT__58(); 

				}
				break;
			case 35 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:214: T__59
				{
				mT__59(); 

				}
				break;
			case 36 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:220: T__60
				{
				mT__60(); 

				}
				break;
			case 37 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:226: T__61
				{
				mT__61(); 

				}
				break;
			case 38 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:232: T__62
				{
				mT__62(); 

				}
				break;
			case 39 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:238: T__63
				{
				mT__63(); 

				}
				break;
			case 40 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:244: T__64
				{
				mT__64(); 

				}
				break;
			case 41 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:250: T__65
				{
				mT__65(); 

				}
				break;
			case 42 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:256: T__66
				{
				mT__66(); 

				}
				break;
			case 43 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:262: T__67
				{
				mT__67(); 

				}
				break;
			case 44 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:268: T__68
				{
				mT__68(); 

				}
				break;
			case 45 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:274: T__69
				{
				mT__69(); 

				}
				break;
			case 46 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:280: T__70
				{
				mT__70(); 

				}
				break;
			case 47 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:286: T__71
				{
				mT__71(); 

				}
				break;
			case 48 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:292: T__72
				{
				mT__72(); 

				}
				break;
			case 49 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:298: T__73
				{
				mT__73(); 

				}
				break;
			case 50 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:304: T__74
				{
				mT__74(); 

				}
				break;
			case 51 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:310: T__75
				{
				mT__75(); 

				}
				break;
			case 52 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:316: T__76
				{
				mT__76(); 

				}
				break;
			case 53 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:322: T__77
				{
				mT__77(); 

				}
				break;
			case 54 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:328: T__78
				{
				mT__78(); 

				}
				break;
			case 55 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:334: T__79
				{
				mT__79(); 

				}
				break;
			case 56 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:340: T__80
				{
				mT__80(); 

				}
				break;
			case 57 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:346: T__81
				{
				mT__81(); 

				}
				break;
			case 58 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:352: T__82
				{
				mT__82(); 

				}
				break;
			case 59 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:358: T__83
				{
				mT__83(); 

				}
				break;
			case 60 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:364: T__84
				{
				mT__84(); 

				}
				break;
			case 61 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:370: T__85
				{
				mT__85(); 

				}
				break;
			case 62 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:376: T__86
				{
				mT__86(); 

				}
				break;
			case 63 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:382: T__87
				{
				mT__87(); 

				}
				break;
			case 64 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:388: T__88
				{
				mT__88(); 

				}
				break;
			case 65 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:394: T__89
				{
				mT__89(); 

				}
				break;
			case 66 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:400: T__90
				{
				mT__90(); 

				}
				break;
			case 67 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:406: T__91
				{
				mT__91(); 

				}
				break;
			case 68 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:412: T__92
				{
				mT__92(); 

				}
				break;
			case 69 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:418: T__93
				{
				mT__93(); 

				}
				break;
			case 70 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:424: T__94
				{
				mT__94(); 

				}
				break;
			case 71 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:430: T__95
				{
				mT__95(); 

				}
				break;
			case 72 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:436: T__96
				{
				mT__96(); 

				}
				break;
			case 73 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:442: T__97
				{
				mT__97(); 

				}
				break;
			case 74 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:448: T__98
				{
				mT__98(); 

				}
				break;
			case 75 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:454: T__99
				{
				mT__99(); 

				}
				break;
			case 76 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:460: T__100
				{
				mT__100(); 

				}
				break;
			case 77 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:467: T__101
				{
				mT__101(); 

				}
				break;
			case 78 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:474: T__102
				{
				mT__102(); 

				}
				break;
			case 79 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:481: T__103
				{
				mT__103(); 

				}
				break;
			case 80 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:488: T__104
				{
				mT__104(); 

				}
				break;
			case 81 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:495: T__105
				{
				mT__105(); 

				}
				break;
			case 82 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:502: T__106
				{
				mT__106(); 

				}
				break;
			case 83 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:509: T__107
				{
				mT__107(); 

				}
				break;
			case 84 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:516: T__108
				{
				mT__108(); 

				}
				break;
			case 85 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:523: T__109
				{
				mT__109(); 

				}
				break;
			case 86 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:530: T__110
				{
				mT__110(); 

				}
				break;
			case 87 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:537: T__111
				{
				mT__111(); 

				}
				break;
			case 88 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:544: T__112
				{
				mT__112(); 

				}
				break;
			case 89 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:551: T__113
				{
				mT__113(); 

				}
				break;
			case 90 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:558: T__114
				{
				mT__114(); 

				}
				break;
			case 91 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:565: HexLiteral
				{
				mHexLiteral(); 

				}
				break;
			case 92 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:576: DecimalLiteral
				{
				mDecimalLiteral(); 

				}
				break;
			case 93 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:591: OctalLiteral
				{
				mOctalLiteral(); 

				}
				break;
			case 94 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:604: FloatingPointLiteral
				{
				mFloatingPointLiteral(); 

				}
				break;
			case 95 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:625: CharacterLiteral
				{
				mCharacterLiteral(); 

				}
				break;
			case 96 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:642: StringLiteral
				{
				mStringLiteral(); 

				}
				break;
			case 97 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:656: ENUM
				{
				mENUM(); 

				}
				break;
			case 98 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:661: ASSERT
				{
				mASSERT(); 

				}
				break;
			case 99 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:668: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 100 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:679: WS
				{
				mWS(); 

				}
				break;
			case 101 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:682: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 102 :
				// C:\\Users\\Mayank Pidiha\\Documents\\MS CS SEM 3\\Software Maintenance\\Software Project\\oopie_mandar\\src\\grammar\\JavaPlain.g:1:690: LINE_COMMENT
				{
				mLINE_COMMENT(); 

				}
				break;

		}
	}


	protected DFA18 dfa18 = new DFA18(this);
	protected DFA29 dfa29 = new DFA29(this);
	static final String DFA18_eotS =
		"\6\uffff";
	static final String DFA18_eofS =
		"\6\uffff";
	static final String DFA18_minS =
		"\2\56\4\uffff";
	static final String DFA18_maxS =
		"\1\71\1\146\4\uffff";
	static final String DFA18_acceptS =
		"\2\uffff\1\2\1\1\1\3\1\4";
	static final String DFA18_specialS =
		"\6\uffff}>";
	static final String[] DFA18_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\12\uffff\1\5\1\4\1\5\35\uffff\1\5\1\4\1\5",
			"",
			"",
			"",
			""
	};

	static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
	static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
	static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
	static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
	static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
	static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
	static final short[][] DFA18_transition;

	static {
		int numStates = DFA18_transitionS.length;
		DFA18_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
		}
	}

	protected class DFA18 extends DFA {

		public DFA18(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 18;
			this.eot = DFA18_eot;
			this.eof = DFA18_eof;
			this.min = DFA18_min;
			this.max = DFA18_max;
			this.accept = DFA18_accept;
			this.special = DFA18_special;
			this.transition = DFA18_transition;
		}
		@Override
		public String getDescription() {
			return "1079:1: FloatingPointLiteral : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ FloatTypeSuffix );";
		}
	}

	static final String DFA29_eotS =
		"\1\uffff\1\61\1\63\1\66\2\uffff\1\70\1\73\1\uffff\1\76\1\100\1\105\3\uffff"+
		"\1\107\3\uffff\1\56\2\uffff\1\112\17\56\1\uffff\1\163\2\uffff\2\165\34"+
		"\uffff\1\56\2\uffff\12\56\1\u0085\7\56\1\u008d\23\56\5\uffff\1\u00a8\1"+
		"\165\15\56\1\uffff\6\56\1\u00bc\1\uffff\2\56\1\u00c1\2\56\1\u00c4\20\56"+
		"\1\u00d5\3\56\1\uffff\5\56\1\u00de\1\u00df\1\56\1\u00e1\4\56\1\u00e6\1"+
		"\56\1\u00e8\3\56\1\uffff\4\56\1\uffff\1\u00f0\1\56\1\uffff\1\u00f2\13"+
		"\56\1\u00fe\2\56\1\u0101\1\uffff\1\u0102\6\56\1\u0109\2\uffff\1\u010a"+
		"\1\uffff\1\u010b\3\56\1\uffff\1\56\1\uffff\1\u0110\1\u0112\1\u0113\4\56"+
		"\1\uffff\1\56\1\uffff\5\56\1\u011e\2\56\1\u0121\2\56\1\uffff\1\u0125\1"+
		"\56\2\uffff\1\56\1\u0128\1\u0129\1\56\1\u012b\1\56\3\uffff\2\56\1\u012f"+
		"\1\56\1\uffff\1\56\2\uffff\1\56\1\u0133\2\56\1\u0136\3\56\1\u013a\1\u013b"+
		"\1\uffff\1\u013c\1\56\1\uffff\1\u013e\1\56\1\u0140\1\uffff\2\56\2\uffff"+
		"\1\56\1\uffff\1\u0144\1\56\1\u0146\1\uffff\1\u0147\1\u0148\1\56\1\uffff"+
		"\2\56\1\uffff\1\u014c\1\u014d\1\56\3\uffff\1\56\1\uffff\1\56\1\uffff\2"+
		"\56\1\u0153\1\uffff\1\u0154\3\uffff\3\56\2\uffff\1\56\1\u0159\2\56\1\u015c"+
		"\2\uffff\2\56\1\u015f\1\u0160\1\uffff\1\56\1\u0162\1\uffff\1\u0163\1\u0164"+
		"\2\uffff\1\56\3\uffff\1\56\1\u0167\1\uffff";
	static final String DFA29_eofS =
		"\u0168\uffff";
	static final String DFA29_minS =
		"\1\11\2\75\1\46\2\uffff\1\75\1\53\1\uffff\1\55\1\56\1\52\3\uffff\1\75"+
		"\3\uffff\1\164\2\uffff\1\75\1\142\1\157\1\141\1\145\1\154\1\141\1\146"+
		"\1\157\2\141\1\145\2\150\1\157\1\150\1\uffff\1\75\2\uffff\2\56\34\uffff"+
		"\1\162\2\uffff\2\163\1\157\1\145\1\164\1\163\2\141\1\156\1\146\1\44\1"+
		"\163\1\164\1\165\1\154\1\156\1\157\1\162\1\44\1\160\1\163\1\156\1\164"+
		"\1\167\1\154\1\143\1\151\1\142\1\164\1\157\1\141\1\160\1\151\1\156\1\151"+
		"\1\141\2\151\5\uffff\2\56\1\151\1\164\1\145\1\154\1\141\2\145\1\143\1"+
		"\162\1\163\1\164\1\141\1\142\1\uffff\2\145\1\155\1\163\2\141\1\44\1\uffff"+
		"\1\154\1\164\1\44\1\147\1\151\1\44\1\154\1\153\1\166\1\164\1\154\1\165"+
		"\1\162\1\164\1\151\1\145\1\164\1\143\1\163\1\157\1\156\1\145\1\44\1\144"+
		"\1\141\1\154\1\uffff\1\156\2\162\1\145\1\153\2\44\1\150\1\44\1\163\1\151"+
		"\1\165\1\154\1\44\1\156\1\44\1\145\1\154\1\164\1\uffff\1\145\1\162\1\141"+
		"\1\162\1\uffff\1\44\1\166\1\uffff\1\44\2\141\1\145\1\151\1\162\1\164\1"+
		"\151\1\143\1\162\1\143\1\150\1\44\1\167\1\163\1\44\1\uffff\1\44\1\164"+
		"\1\145\1\147\1\141\1\164\1\141\1\44\2\uffff\1\44\1\uffff\1\44\1\156\1"+
		"\154\1\145\1\uffff\1\144\1\uffff\3\44\1\155\1\164\1\156\1\146\1\uffff"+
		"\1\145\1\uffff\1\147\1\164\2\143\1\156\1\44\1\143\1\164\1\44\1\150\1\162"+
		"\1\uffff\1\44\1\151\2\uffff\1\151\2\44\1\143\1\44\1\156\3\uffff\1\165"+
		"\1\164\1\44\1\163\1\uffff\1\171\2\uffff\1\145\1\44\1\143\1\141\1\44\2"+
		"\145\1\164\2\44\1\uffff\1\44\1\146\1\uffff\1\44\1\157\1\44\1\uffff\1\145"+
		"\1\154\2\uffff\1\164\1\uffff\1\44\1\145\1\44\1\uffff\2\44\1\156\1\uffff"+
		"\1\145\1\143\1\uffff\2\44\1\145\3\uffff\1\160\1\uffff\1\156\1\uffff\1"+
		"\156\1\145\1\44\1\uffff\1\44\3\uffff\1\164\1\157\1\145\2\uffff\1\144\1"+
		"\44\1\151\1\164\1\44\2\uffff\1\163\1\146\2\44\1\uffff\1\172\1\44\1\uffff"+
		"\2\44\2\uffff\1\145\3\uffff\1\144\1\44\1\uffff";
	static final String DFA29_maxS =
		"\1\ufaff\3\75\2\uffff\2\75\1\uffff\1\75\1\71\1\75\3\uffff\1\75\3\uffff"+
		"\1\164\2\uffff\1\75\1\163\1\171\2\157\1\170\1\157\1\156\1\157\2\165\1"+
		"\145\1\171\1\162\1\157\1\150\1\uffff\1\174\2\uffff\1\170\1\146\34\uffff"+
		"\1\162\2\uffff\2\163\1\157\1\145\2\164\2\141\1\156\1\146\1\ufaff\1\163"+
		"\1\164\1\165\1\154\1\156\1\157\1\162\1\ufaff\1\160\1\164\1\156\1\164\1"+
		"\167\1\154\1\143\1\157\1\142\1\164\1\157\1\162\1\160\1\151\1\156\1\162"+
		"\1\171\1\154\1\151\5\uffff\2\146\1\151\1\164\1\145\1\154\1\141\2\145\1"+
		"\143\1\162\1\163\1\164\1\141\1\142\1\uffff\2\145\1\155\1\163\2\141\1\ufaff"+
		"\1\uffff\1\157\1\164\1\ufaff\1\147\1\151\1\ufaff\1\154\1\153\1\166\1\164"+
		"\1\154\1\165\1\162\1\164\1\151\1\145\1\164\1\143\1\163\1\157\1\156\1\145"+
		"\1\ufaff\1\144\1\141\1\154\1\uffff\1\156\2\162\1\145\1\153\2\ufaff\1\150"+
		"\1\ufaff\1\163\1\151\1\165\1\154\1\ufaff\1\156\1\ufaff\1\145\1\154\1\164"+
		"\1\uffff\1\145\1\162\1\141\1\162\1\uffff\1\ufaff\1\166\1\uffff\1\ufaff"+
		"\2\141\1\145\1\151\1\162\1\164\1\151\1\143\1\162\1\143\1\150\1\ufaff\1"+
		"\167\1\163\1\ufaff\1\uffff\1\ufaff\1\164\1\145\1\147\1\141\1\164\1\141"+
		"\1\ufaff\2\uffff\1\ufaff\1\uffff\1\ufaff\1\156\1\154\1\145\1\uffff\1\144"+
		"\1\uffff\3\ufaff\1\155\1\164\1\156\1\146\1\uffff\1\145\1\uffff\1\147\1"+
		"\164\2\143\1\156\1\ufaff\1\143\1\164\1\ufaff\1\150\1\162\1\uffff\1\ufaff"+
		"\1\151\2\uffff\1\151\2\ufaff\1\143\1\ufaff\1\156\3\uffff\1\165\1\164\1"+
		"\ufaff\1\163\1\uffff\1\171\2\uffff\1\145\1\ufaff\1\143\1\141\1\ufaff\2"+
		"\145\1\164\2\ufaff\1\uffff\1\ufaff\1\146\1\uffff\1\ufaff\1\157\1\ufaff"+
		"\1\uffff\1\145\1\154\2\uffff\1\164\1\uffff\1\ufaff\1\145\1\ufaff\1\uffff"+
		"\2\ufaff\1\156\1\uffff\1\145\1\143\1\uffff\2\ufaff\1\145\3\uffff\1\160"+
		"\1\uffff\1\156\1\uffff\1\156\1\145\1\ufaff\1\uffff\1\ufaff\3\uffff\1\164"+
		"\1\157\1\145\2\uffff\1\144\1\ufaff\1\151\1\164\1\ufaff\2\uffff\1\163\1"+
		"\146\2\ufaff\1\uffff\1\172\1\ufaff\1\uffff\2\ufaff\2\uffff\1\145\3\uffff"+
		"\1\144\1\ufaff\1\uffff";
	static final String DFA29_acceptS =
		"\4\uffff\1\10\1\11\2\uffff\1\17\3\uffff\1\27\1\30\1\31\1\uffff\1\34\1"+
		"\35\1\36\1\uffff\1\40\1\41\20\uffff\1\125\1\uffff\1\131\1\132\2\uffff"+
		"\1\137\1\140\1\143\1\144\1\2\1\1\1\4\1\3\1\5\1\7\1\6\1\13\1\12\1\15\1"+
		"\16\1\14\1\21\1\22\1\20\1\24\1\23\1\136\1\26\1\145\1\146\1\25\1\33\1\32"+
		"\1\uffff\1\43\1\42\46\uffff\1\127\1\130\1\126\1\133\1\134\17\uffff\1\56"+
		"\7\uffff\1\67\32\uffff\1\135\23\uffff\1\66\4\uffff\1\73\2\uffff\1\77\20"+
		"\uffff\1\121\10\uffff\1\47\1\50\1\uffff\1\52\4\uffff\1\60\1\uffff\1\141"+
		"\7\uffff\1\75\1\uffff\1\100\13\uffff\1\114\2\uffff\1\120\1\122\6\uffff"+
		"\1\46\1\51\1\53\4\uffff\1\62\1\uffff\1\63\1\65\12\uffff\1\106\2\uffff"+
		"\1\111\3\uffff\1\115\2\uffff\1\124\1\37\1\uffff\1\142\3\uffff\1\57\3\uffff"+
		"\1\71\2\uffff\1\76\3\uffff\1\104\1\105\1\107\1\uffff\1\112\1\uffff\1\116"+
		"\3\uffff\1\45\1\uffff\1\55\1\61\1\64\3\uffff\1\101\1\102\5\uffff\1\44"+
		"\1\54\4\uffff\1\110\2\uffff\1\123\2\uffff\1\74\1\103\1\uffff\1\117\1\70"+
		"\1\72\2\uffff\1\113";
	static final String DFA29_specialS =
		"\u0168\uffff}>";
	static final String[] DFA29_transitionS = {
			"\2\57\1\uffff\2\57\22\uffff\1\57\1\1\1\55\1\uffff\1\56\1\2\1\3\1\54\1"+
			"\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\52\11\53\1\14\1\15\1\16\1\17\1\20"+
			"\1\21\1\22\22\56\1\23\7\56\1\24\1\uffff\1\25\1\26\1\56\1\uffff\1\27\1"+
			"\30\1\31\1\32\1\33\1\34\2\56\1\35\2\56\1\36\1\56\1\37\1\56\1\40\1\56"+
			"\1\41\1\42\1\43\1\56\1\44\1\45\3\56\1\46\1\47\1\50\1\51\101\uffff\27"+
			"\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff\u0080"+
			"\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200\56",
			"\1\60",
			"\1\62",
			"\1\64\26\uffff\1\65",
			"",
			"",
			"\1\67",
			"\1\71\21\uffff\1\72",
			"",
			"\1\74\17\uffff\1\75",
			"\1\77\1\uffff\12\101",
			"\1\103\4\uffff\1\104\15\uffff\1\102",
			"",
			"",
			"",
			"\1\106",
			"",
			"",
			"",
			"\1\110",
			"",
			"",
			"\1\111",
			"\1\113\20\uffff\1\114",
			"\1\115\2\uffff\1\116\6\uffff\1\117",
			"\1\120\6\uffff\1\121\3\uffff\1\122\2\uffff\1\123",
			"\1\124\11\uffff\1\125",
			"\1\126\1\uffff\1\130\11\uffff\1\127",
			"\1\131\7\uffff\1\132\2\uffff\1\133\2\uffff\1\134",
			"\1\135\6\uffff\1\136\1\137",
			"\1\140",
			"\1\141\3\uffff\1\142\17\uffff\1\143",
			"\1\144\20\uffff\1\145\2\uffff\1\146",
			"\1\147",
			"\1\150\13\uffff\1\151\1\152\1\uffff\1\153\1\uffff\1\154",
			"\1\155\11\uffff\1\156",
			"\1\157",
			"\1\160",
			"",
			"\1\161\76\uffff\1\162",
			"",
			"",
			"\1\101\1\uffff\10\166\2\101\12\uffff\3\101\21\uffff\1\164\13\uffff\3"+
			"\101\21\uffff\1\164",
			"\1\101\1\uffff\12\167\12\uffff\3\101\35\uffff\3\101",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\170",
			"",
			"",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u0084"+
			"\5\56\105\uffff\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150"+
			"\56\u0170\uffff\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900"+
			"\uffff\u0200\56",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u008e",
			"\1\u008f\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096\5\uffff\1\u0097",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b\20\uffff\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0\10\uffff\1\u00a1",
			"\1\u00a2\23\uffff\1\u00a3\3\uffff\1\u00a4",
			"\1\u00a5\2\uffff\1\u00a6",
			"\1\u00a7",
			"",
			"",
			"",
			"",
			"",
			"\1\101\1\uffff\10\166\2\101\12\uffff\3\101\35\uffff\3\101",
			"\1\101\1\uffff\12\167\12\uffff\3\101\35\uffff\3\101",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00ba",
			"\1\u00bb",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"",
			"\1\u00bd\2\uffff\1\u00be",
			"\1\u00bf",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00c0"+
			"\25\56\105\uffff\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150"+
			"\56\u0170\uffff\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900"+
			"\uffff\u0200\56",
			"\1\u00c2",
			"\1\u00c3",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce",
			"\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\1\u00d4",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u00d6",
			"\1\u00d7",
			"\1\u00d8",
			"",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u00e0",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4",
			"\1\u00e5",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u00e7",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u00e9",
			"\1\u00ea",
			"\1\u00eb",
			"",
			"\1\u00ec",
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u00f1",
			"",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u00f3",
			"\1\u00f4",
			"\1\u00f5",
			"\1\u00f6",
			"\1\u00f7",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"\1\u00fd",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u00ff",
			"\1\u0100",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u0103",
			"\1\u0104",
			"\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"",
			"",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u010c",
			"\1\u010d",
			"\1\u010e",
			"",
			"\1\u010f",
			"",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u0111"+
			"\16\56\105\uffff\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150"+
			"\56\u0170\uffff\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900"+
			"\uffff\u0200\56",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u0114",
			"\1\u0115",
			"\1\u0116",
			"\1\u0117",
			"",
			"\1\u0118",
			"",
			"\1\u0119",
			"\1\u011a",
			"\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u011f",
			"\1\u0120",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u0122",
			"\1\u0123",
			"",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\u0124"+
			"\7\56\105\uffff\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150"+
			"\56\u0170\uffff\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900"+
			"\uffff\u0200\56",
			"\1\u0126",
			"",
			"",
			"\1\u0127",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u012a",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u012c",
			"",
			"",
			"",
			"\1\u012d",
			"\1\u012e",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u0130",
			"",
			"\1\u0131",
			"",
			"",
			"\1\u0132",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u0134",
			"\1\u0135",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u0137",
			"\1\u0138",
			"\1\u0139",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u013d",
			"",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u013f",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"",
			"\1\u0141",
			"\1\u0142",
			"",
			"",
			"\1\u0143",
			"",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u0145",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u0149",
			"",
			"\1\u014a",
			"\1\u014b",
			"",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u014e",
			"",
			"",
			"",
			"\1\u014f",
			"",
			"\1\u0150",
			"",
			"\1\u0151",
			"\1\u0152",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"",
			"",
			"",
			"\1\u0155",
			"\1\u0156",
			"\1\u0157",
			"",
			"",
			"\1\u0158",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\u015a",
			"\1\u015b",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"",
			"",
			"\1\u015d",
			"\1\u015e",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"",
			"\1\u0161",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			"",
			"",
			"\1\u0165",
			"",
			"",
			"",
			"\1\u0166",
			"\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56\105\uffff"+
			"\27\56\1\uffff\37\56\1\uffff\u1f08\56\u1040\uffff\u0150\56\u0170\uffff"+
			"\u0080\56\u0080\uffff\u092e\56\u10d2\uffff\u5200\56\u5900\uffff\u0200"+
			"\56",
			""
	};

	static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
	static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
	static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
	static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
	static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
	static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
	static final short[][] DFA29_transition;

	static {
		int numStates = DFA29_transitionS.length;
		DFA29_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
		}
	}

	protected class DFA29 extends DFA {

		public DFA29(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 29;
			this.eot = DFA29_eot;
			this.eof = DFA29_eof;
			this.min = DFA29_min;
			this.max = DFA29_max;
			this.accept = DFA29_accept;
			this.special = DFA29_special;
			this.transition = DFA29_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | HexLiteral | DecimalLiteral | OctalLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | ENUM | ASSERT | Identifier | WS | COMMENT | LINE_COMMENT );";
		}
	}

}
