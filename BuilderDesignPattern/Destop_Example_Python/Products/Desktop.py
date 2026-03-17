class Desktop:

	_monitor: str
	_keyboard: str
	_mouse: str
	_speaker: str
	_ram: str
	_processor: str
	_motherboard: str

	def setMonitor(self, monitor):
		self._monitor = monitor

	def setKeyboard(self, keyboard):
		self._keyboard = keyboard
	
	def setMouse(self, mouse):
		self._mouse = mouse
	
	def setSpeakers(self, speaker):
		self._speaker = speaker
	
	def setRam(self, ram):
		self._ram = ram
	
	def setProcessor(self, processor):
		self._processor = processor
	
	def setMotherboard(self, motherboard):
		self._motherboard = motherboard
	
	def __repr__(self):
		return f"""Desktop: {{
					monitor = {self._monitor}
					keyboard = {self._keyboard}
	 				mouse = {self._mouse}
	 				speakers = {self._speaker}
	 				ram = {self._ram}
	 				processor = {self._processor}
 					motherboard = {self._motherboard}
            		}}"""
	
	def __str__(self):
		return f"""Desktop: {{
					monitor = {self._monitor}
					keyboard = {self._keyboard}
			 		mouse = {self._mouse}
			 		speakers = {self._speaker}
			 		ram = {self._ram}
			 		processor = {self._processor}
		 			motherboard = {self._motherboard}
		            }}"""